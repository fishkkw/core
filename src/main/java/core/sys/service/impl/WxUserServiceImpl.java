package core.sys.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import core.sys.dao.WxuserMapper;
import core.sys.entity.Wxuser;
import core.sys.service.WxUserService;
import core.util.ContantUtils;
import core.util.HttpUtils;
import core.util.Msg;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;

@Service
@Repository("wxUserService")
public class WxUserServiceImpl implements WxUserService {
    private static final Logger logger = LoggerFactory.getLogger(WxUserServiceImpl.class);

    @Autowired
    private WxuserMapper wxuserMapper;

    @Override
    public Msg wxUserLogin(String code, String encryptedData, String iv) {
        JSONObject json = new JSONObject();
        json.put("appid", ContantUtils.WECHAT_APPID);
        json.put("secret", ContantUtils.WECHAT_SECRET);
        json.put("js_code", code);
        json.put("grant_type", ContantUtils.GRANT_TYPE);
        String result = HttpUtils.httpGet(ContantUtils.WECHAT_URL, json);
        JSONObject jsonObject = JSON.parseObject(result);
        if (jsonObject.containsKey("errcode")) {
            logger.info("微信返回的错误码: " + jsonObject.get("errcode").toString() + "错误信息: " + jsonObject.get("errmsg"));
        } else if (jsonObject.containsKey("openid") && jsonObject.containsKey("session_key")) {
            logger.info("调用微信接口成功");
            String openId = jsonObject.getString("openid");
            String sessionKey = jsonObject.getString("session_key");
            //查询openid是否存在，若不存在，进行入库操作
            int isExist_openId = wxuserMapper.selectByPrimaryKey(openId);
            if (isExist_openId > 0) {
                logger.info("已存在该用户");
            } else {
                logger.info("该用户不在表中，需进行新增");
                JSONObject userInfo = getUserInfo(encryptedData,sessionKey,iv);
                if (null != userInfo) {
                    Wxuser wxuser = new Wxuser();
                    wxuser.setOpenid(openId);
                    wxuser.setNickName( userInfo.getString("nickName"));
                    wxuser.setGender(userInfo.getString("gender"));
                    wxuser.setCity(userInfo.getString("city"));
                    wxuser.setProvince(userInfo.getString("province"));
                    wxuser.setCountry( userInfo.getString("country"));
                    wxuser.setAvatarUrl(userInfo.getString("avatarUrl"));
                    //wxuserMapper.insert(wxuser);
                }
            }
        }

        return Msg.success();
    }

    /**
     * 解密用户敏感数据获取用户信息
     *
     * @param sessionKey    数据进行加密签名的密钥
     * @param encryptedData 包括敏感数据在内的完整用户信息的加密数据
     * @param iv            加密算法的初始向量
     * @return
     * */
    public static JSONObject getUserInfo(String encryptedData, String sessionKey, String iv) {
        // 被加密的数据
        byte[] dataByte = Base64Utils.decode(encryptedData.getBytes());
        // 加密秘钥
        byte[] keyByte = Base64Utils.decode(sessionKey.getBytes());
        // 偏移量
        byte[] ivByte = Base64Utils.decode(iv.getBytes());
        try {

            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, "UTF-8");
                return JSON.parseObject(result);
            }
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.getMessage(), e);
        } catch (NoSuchPaddingException e) {
            logger.error(e.getMessage(), e);
        } catch (InvalidParameterSpecException e) {
            logger.error(e.getMessage(), e);
        } catch (IllegalBlockSizeException e) {
            logger.error(e.getMessage(), e);
        } catch (BadPaddingException e) {
            logger.error(e.getMessage(), e);
        } catch (UnsupportedEncodingException e) {
            logger.error(e.getMessage(), e);
        } catch (InvalidKeyException e) {
            logger.error(e.getMessage(), e);
        } catch (InvalidAlgorithmParameterException e) {
            logger.error(e.getMessage(), e);
        } catch (NoSuchProviderException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}

package core.sys.service;

import core.util.Msg;

public interface WxUserService {
    /**
     * 微信用户登录
     * @param code
     * @return
     */
    Msg wxUserLogin(String code, String encryptedData, String iv);
}

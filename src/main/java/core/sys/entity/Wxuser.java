package core.sys.entity;

public class Wxuser {
    /**
     * 微信点餐的客户的唯一标识
     */
    private String openid;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 所属商户
     */
    private String mchId;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }
}
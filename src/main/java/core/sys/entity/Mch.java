package core.sys.entity;

public class Mch {
    /**
     * 标识每一个商家，同时也是小程序appid
     */
    private String id;

    /**
     * 每个商家的名称
     */
    private String name;

    /**
     * 商户创建时间
     */
    private String createTime;

    /**
     * 试用版？
     */
    private Boolean trialVersion;

    /**
     * 商铺地址
     */
    private String address;

    /**
     * 商铺联系电话
     */
    private String tel;

    /**
     * 商铺联系人
     */
    private String contactName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Boolean getTrialVersion() {
        return trialVersion;
    }

    public void setTrialVersion(Boolean trialVersion) {
        this.trialVersion = trialVersion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }
}
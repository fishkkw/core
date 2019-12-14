package core.sys.entity;

public class Order {
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单创建时间
     */
    private String createTime;

    /**
     * 订单所属用户id
     */
    private String wxUserId;

    /**
     * 订单状态，具体数字代表什么意思待定
     */
    private Integer status;

    /**
     * 订单总数额
     */
    private Double totalFee;

    /**
     * 1、微信支付；2、支付宝支付
     */
    private Boolean payType;

    /**
     * 所属商户id
     */
    private String mchId;

    /**
     */
    private String payTime;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId == null ? null : wxUserId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }
}
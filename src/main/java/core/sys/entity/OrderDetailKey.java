package core.sys.entity;

public class OrderDetailKey {
    /**
     * 订单id
     */
    private String orderNo;

    /**
     * 商品id
     */
    private String productId;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }
}
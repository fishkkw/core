package core.sys.entity;

public class OrderDetail extends OrderDetailKey {
    /**
     * 商品进价
     */
    private Long price;

    /**
     * 商品卖价
     */
    private Long salePrice;

    /**
     * 商品数量
     */
    private Integer count;

    /**
     * 所属商户id
     */
    private String mchId;

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }
}
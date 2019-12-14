package core.sys.entity;

public class CataLogProDuct {
	/**
	 * 商品id
	 */
	private String productId;

	/**
	 * 商品分类id
	 */
	private String catalogId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId == null ? null : productId.trim();
	}

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId == null ? null : catalogId.trim();
	}
}
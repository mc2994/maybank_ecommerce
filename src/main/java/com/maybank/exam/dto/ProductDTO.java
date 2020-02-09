package com.maybank.exam.dto;

public class ProductDTO {

	private Integer productId;

	private String url;

	private String title;

	private Integer price;
	
	private Integer msrp;

	private Byte isAvailable;

	private String description;

	private String imageUrl;

	private CategoryDTO category;
	
	private MerchantDTO merchant;
	
	private SubCategoryDTO subCategory;

	public ProductDTO() {
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Byte getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Byte isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public MerchantDTO getMerchant() {
		return merchant;
	}

	public void setMerchant(MerchantDTO merchant) {
		this.merchant = merchant;
	}

	public SubCategoryDTO getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategoryDTO subCategory) {
		this.subCategory = subCategory;
	}

	public Integer getMsrp() {
		return msrp;
	}

	public void setMsrp(Integer msrp) {
		this.msrp = msrp;
	}
}
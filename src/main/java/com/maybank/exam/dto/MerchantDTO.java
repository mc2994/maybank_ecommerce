package com.maybank.exam.dto;

public class MerchantDTO {

	private Integer merchantId;

	private String merchantName;

	public MerchantDTO() {

	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
}
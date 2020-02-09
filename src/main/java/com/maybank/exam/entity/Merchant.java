package com.maybank.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "merchant")
public class Merchant {

	@Id
	@Column(name = "merchant_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer merchantId;

	@Column(name = "merchant_name")
	private String merchantName;

	public Merchant() {

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
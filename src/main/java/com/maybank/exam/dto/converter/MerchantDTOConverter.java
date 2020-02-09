package com.maybank.exam.dto.converter;

import com.maybank.exam.dto.MerchantDTO;
import com.maybank.exam.entity.Merchant;

public class MerchantDTOConverter {

	public static MerchantDTO convertModelToDTO(Merchant merchant) {
		MerchantDTO dto = new MerchantDTO();
		dto.setMerchantId(merchant.getMerchantId());
		dto.setMerchantName(merchant.getMerchantName());
		return dto;
	}

	public static Merchant convertDTOToModel(MerchantDTO dto) {
		Merchant model = new Merchant();
		model.setMerchantId(dto.getMerchantId());
		model.setMerchantName(dto.getMerchantName());
		return model;
	}

}

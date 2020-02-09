package com.maybank.exam.dto.converter;

import java.util.ArrayList;
import java.util.List;
import com.maybank.exam.dto.ProductDTO;
import com.maybank.exam.entity.Product;

public class ProductDTOConverter {

	public static List<ProductDTO> convertModelToDTOList(List<Product> products) {
		List<ProductDTO> dtoList = new ArrayList<ProductDTO>();
		for (Product product : products) {
			ProductDTO dto = new ProductDTO();
			dto.setDescription(product.getDescription());
			dto.setImageUrl(product.getImageUrl());
			dto.setIsAvailable(product.getIsAvailable());
			dto.setPrice(product.getPrice());
			dto.setProductId(product.getProductId());
			dto.setTitle(product.getTitle());
			dto.setUrl(product.getUrl());
			dto.setMsrp(product.getMsrp());
			dto.setCategory(CategoryDTOConverter.convertModelToDTO(product.getCategory()));
			dto.setMerchant(MerchantDTOConverter.convertModelToDTO(product.getMerchant()));
			dto.setSubCategory(SubCategoryConverter.convertModelToDTO(product.getSubCategory()));
			dtoList.add(dto);
		}
		return dtoList;
	}

	public static ProductDTO convertModelToDTO(Product product) {
		ProductDTO dto = new ProductDTO();
		dto.setDescription(product.getDescription());
		dto.setImageUrl(product.getImageUrl());
		dto.setIsAvailable(product.getIsAvailable());
		dto.setPrice(product.getPrice());
		dto.setProductId(product.getProductId());
		dto.setTitle(product.getTitle());
		dto.setUrl(product.getUrl());
		dto.setMsrp(dto.getMsrp());
		dto.setCategory(CategoryDTOConverter.convertModelToDTO(product.getCategory()));
		dto.setMerchant(MerchantDTOConverter.convertModelToDTO(product.getMerchant()));
		dto.setSubCategory(SubCategoryConverter.convertModelToDTO(product.getSubCategory()));
		return dto;
	}
	
	public static Product convertDTOToModel(ProductDTO dto) {
		Product model = new Product();
		model.setDescription(dto.getDescription());
		model.setImageUrl(dto.getImageUrl());
		model.setIsAvailable(dto.getIsAvailable());
		model.setPrice(dto.getPrice());
		model.setProductId(dto.getProductId());
		model.setTitle(dto.getTitle());
		model.setUrl(dto.getUrl());
		model.setMsrp(dto.getMsrp());
		model.setCategory(CategoryDTOConverter.convertDTOToModel(dto.getCategory()));
		model.setMerchant(MerchantDTOConverter.convertDTOToModel(dto.getMerchant()));
		model.setSubCategory(SubCategoryConverter.convertDTOToModel(dto.getSubCategory()));
		return model;
	}
}
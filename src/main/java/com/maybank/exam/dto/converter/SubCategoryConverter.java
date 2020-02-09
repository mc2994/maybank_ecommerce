package com.maybank.exam.dto.converter;

import com.maybank.exam.dto.SubCategoryDTO;
import com.maybank.exam.entity.SubCategory;

public class SubCategoryConverter {

	public static SubCategoryDTO convertModelToDTO(SubCategory model) {
		SubCategoryDTO dto = new SubCategoryDTO();
		dto.setName(model.getName());
		dto.setSubCategoryId(model.getSubCategoryId());
		// dto.setCategory(CategoryDTOConverter.convertModelToDTO(model.getCategory()));
		return dto;
	}

	public static SubCategory convertDTOToModel(SubCategoryDTO dto) {
		SubCategory model = new SubCategory();
		model.setName(dto.getName());
		model.setSubCategoryId(dto.getSubCategoryId());
		// model.setCategory(CategoryDTOConverter.convertDTOToModel(dto.getCategory()));
		return model;
	}
}
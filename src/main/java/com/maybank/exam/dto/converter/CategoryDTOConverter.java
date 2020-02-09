package com.maybank.exam.dto.converter;

import com.maybank.exam.dto.CategoryDTO;
import com.maybank.exam.entity.Category;

public class CategoryDTOConverter {

	public static CategoryDTO convertModelToDTO(Category model) {
		CategoryDTO dto = new CategoryDTO();
		dto.setCategoryId(model.getCategoryId());
		dto.setCategoryName(model.getCategoryName());
		return dto;
	}

	public static Category convertDTOToModel(CategoryDTO dto) {
		Category model = new Category();
		model.setCategoryId(dto.getCategoryId());
		model.setCategoryName(dto.getCategoryName());
		return model;
	}
}
package com.godoro.inventory.business.service;

import java.util.ArrayList;
import java.util.List;

import com.godoro.inventory.business.dto.CategoryDto;
import com.godoro.inventory.data.entity.Category;
import com.godoro.inventory.data.repository.CategoryRepository;

public class CategoryServiceImpl implements CategoryService{

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

	@Override
	public List<CategoryDto> findAll() {
		List<CategoryDto> categoryDtos = new ArrayList<>();
		Iterable<Category> categories = categoryRepository.findAll();
		for(Category category : categories) {
			CategoryDto categoryDto = new CategoryDto();
			categoryDto.setCategoryId(category.getCategoryId());
			categoryDto.setCategoryName(category.getCategoryName());
			categoryDtos.add(categoryDto);
		}
		return categoryDtos;
	}
}

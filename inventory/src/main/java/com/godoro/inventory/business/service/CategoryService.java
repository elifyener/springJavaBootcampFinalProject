package com.godoro.inventory.business.service;

import java.util.List;

import com.godoro.inventory.business.dto.CategoryDto;

public interface CategoryService {
        List<CategoryDto> findAll();
}

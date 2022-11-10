package com.godoro.commerce.service;

import com.godoro.commerce.data.CategoryDto;
import com.godoro.commerce.data.ProductDto;

import java.util.List;

public interface InventoryService {
    List<CategoryDto>getCategories();
    ProductDto getProduct(long productId);
    List<ProductDto> getProductsByCategory(long categoryId);
}

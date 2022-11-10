package com.godoro.inventory.business.service;

import java.util.List;

import com.godoro.inventory.business.dto.ProductDto;

public interface ProductService {

	ProductDto find(long productId);

    List<ProductDto> findAllByCategoryId(long categoryId);

}

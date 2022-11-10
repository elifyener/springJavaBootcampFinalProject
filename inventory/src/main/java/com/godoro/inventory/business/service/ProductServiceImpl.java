package com.godoro.inventory.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.godoro.inventory.business.dto.ProductDto;
import com.godoro.inventory.data.entity.Product;
import com.godoro.inventory.data.repository.ProductRepository;


public class ProductServiceImpl implements ProductService{

	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public ProductDto find(long productId) {
		Optional<Product> optional = productRepository.findById(productId);
		if(optional.isPresent()) {
			Product product = optional.get();
			ProductDto productDto = new ProductDto();
			productDto.setProductName(product.getProductName());
			productDto.setSalesPrice(product.getSalesPrice());
			return productDto;
		}
		return null;
	}

	@Override
	public List<ProductDto> findAllByCategoryId(long categoryId) {
		Optional<List<Product>> optional = Optional.ofNullable(productRepository.findAllByCategoryId(categoryId));
        if(optional.isPresent()){
            List<ProductDto>  productDtos = new ArrayList<>();
            for(Product product : optional.get()){
                ProductDto productDto = new ProductDto();
                productDto.setProductId(product.getProductId());
                productDto.setProductName(product.getProductName());
                productDto.setSalesPrice(product.getSalesPrice());
                productDtos.add(productDto);
            }
            return productDtos;
        }
        return null;
	}

	
}

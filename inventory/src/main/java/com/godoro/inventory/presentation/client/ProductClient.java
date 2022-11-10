package com.godoro.inventory.presentation.client;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.godoro.inventory.business.dto.ProductDto;

@Component
public class ProductClient {

    public ProductDto getProduct(long productId){
        String url = "http://localhost:8081/api/inventory/product/"+productId;
        RestTemplate restTemplate = new RestTemplate();
        ProductDto productDto = restTemplate.getForObject(url, ProductDto.class);
        return productDto;
    }

    public List<ProductDto> getProductByCategoty(long categoryId){
        String url = "http://localhost:8081/api/inventory/products/"+categoryId;
        RestTemplate restTemplate = new RestTemplate();
        List<ProductDto> productDtoList = restTemplate.getForObject(url, List.class);
        return productDtoList;
    }
}

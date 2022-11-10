package com.godoro.inventory.presentation.client;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.godoro.inventory.business.dto.CategoryDto;

@Component
public class CategoryClient {
	public List<CategoryDto> getCategories(){
        String url = "http://localhost:8081/api/inventory/categories";
        RestTemplate restTemplate = new RestTemplate();
        List<CategoryDto> categoryDtos = restTemplate.getForObject(url, List.class);
        return categoryDtos;
    }
}

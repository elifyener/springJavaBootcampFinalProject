package com.godoro.commerce.service;

import com.godoro.commerce.client.InventoryClient;
import com.godoro.commerce.data.CategoryDto;
import com.godoro.commerce.data.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryServiceImpl implements InventoryService{

    private InventoryClient inventoryClient;

    public InventoryServiceImpl(InventoryClient inventoryClient){
        this.inventoryClient = inventoryClient;
    }

    @Override
    public List<CategoryDto> getCategories() {
        return inventoryClient.getCategories();
    }

    @Override
    public ProductDto getProduct(long productId) {
        return inventoryClient.getProduct(productId);
    }

    @Override
    public List<ProductDto> getProductsByCategory(long categoryId) {
        return inventoryClient.getProductsByCategory(categoryId);
    }
}

package com.godoro.shopping.business.service;

import com.godoro.shopping.business.dto.CartProductDto;
import com.godoro.shopping.data.entity.CartProduct;
import org.springframework.data.repository.CrudRepository;

public interface CartProductService{
    String addProduct(CartProductDto cartProductDto);

    String removeProductFromCart(long cartId, long productId);

}

package com.godoro.shopping.business.service;

import com.godoro.shopping.business.dto.CartDto;
import com.godoro.shopping.data.entity.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartService{
    long create();
    String checkout(long cartId);
    CartDto find(long cartId);
}

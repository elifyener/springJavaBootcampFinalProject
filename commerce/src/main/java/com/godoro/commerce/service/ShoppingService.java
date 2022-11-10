package com.godoro.commerce.service;

import com.godoro.commerce.data.CartDto;
import com.godoro.commerce.data.CartProductDto;

public interface ShoppingService {

    long createCart();
    String checkoutCart(long cartId);
    CartDto findCart(long cartId);
    String addProductToCart(CartProductDto cartProductDto);
    String removeProductFromCart(long cartId, long productId);
}

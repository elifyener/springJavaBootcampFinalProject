package com.godoro.commerce.rest;

import com.godoro.commerce.client.ShoppingClient;
import com.godoro.commerce.data.CartDto;
import com.godoro.commerce.data.CartProductDto;
import com.godoro.commerce.data.CategoryDto;
import com.godoro.commerce.data.ProductDto;
import com.godoro.commerce.service.ShoppingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingResource {

    private ShoppingService shoppingService;

    public ShoppingResource(ShoppingService shoppingService){
        this.shoppingService = shoppingService;
    }

    @GetMapping("/api/commerce/shopping/cart/create")
    public long createCart(){
        return shoppingService.createCart();
    }

    @PutMapping("/api/commerce/shopping/checkout/{cartId}")
    public String checkoutCart(@PathVariable("cartId") long cartId){
        return shoppingService.checkoutCart(cartId);
    }

    @GetMapping("/api/commerce/shopping/cart/find/{cartId}")
    public CartDto findCart(@PathVariable("cartId") long cartId){
        return shoppingService.findCart(cartId);
    }

    @PostMapping("/api/commerce/shopping/cart/add")
    public String addProductToCart(@RequestBody CartProductDto cartProductDto){
        return shoppingService.addProductToCart(cartProductDto);
    }

    @DeleteMapping("/api/commerce/shopping/cart/remove/{cartId}/{productId}")
    public String removeProductFromCart(@PathVariable("cartId") long cartId, @PathVariable("productId") long productId){
        return shoppingService.removeProductFromCart(cartId,productId);
    }

}

package com.myProject.ecommerce.system.service;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Cart;
import com.myProject.ecommerce.system.data.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    void addProductToCart(Long cartId, ProductDto productdto);
    boolean removeProductFromCart(Long productId);
    Cart getCartDetails(Long id);
    long getNumberOfProductsInCart(Long cartId);
    long getTotalOfProductsInCart(Long cartId);
}

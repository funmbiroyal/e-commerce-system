package com.myProject.ecommerce.system.service;

import com.myProject.ecommerce.system.data.dto.CartDto;
import com.myProject.ecommerce.system.data.model.Cart;
import com.myProject.ecommerce.system.data.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    Cart createCart(CartDto cartDto);
    void addProduct(Long cartId, Product product);
    boolean removeProductFromCart(Long productId);
    Cart getCartDetails(Long id);
    Long getNumberOfProductsInCart(Long cartId);
    List<Product> getTotalOfProductsInCart();
    List<Product> findProductsInCart(Long cartId);

}

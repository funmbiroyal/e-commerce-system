package com.myProject.ecommerce.system.service;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Cart;
import com.myProject.ecommerce.system.data.model.Product;
import com.myProject.ecommerce.system.data.repository.CartRepository;
import com.myProject.ecommerce.system.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    ProductServiceImpl productServiceImpl;
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;
    @Override
    public void addProductToCart(Long cartId,ProductDto productDto) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart!= null){
            cart.setProduct(productDto.getProduct());
            cartRepository.save(cart);
        }
    }

    @Override
    public boolean removeProductFromCart(Long productId) {
        cartRepository.deleteById(productId);
        return true;
    }

    @Override
    public Cart getCartDetails(Long id) {
        return cartRepository.getById(id);
    }

    @Override
    public long getNumberOfProductsInCart(Long cartId) {
        long numberOfProductsInCart = 0;
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null) {
          numberOfProductsInCart = cart.getNumberOfProducts();
        }
       return numberOfProductsInCart;

    }

    @Override
    public long getTotalOfProductsInCart(Long cartId) {
        long totalOfProductsInCart = 0;
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if ( cart!= null){
            totalOfProductsInCart = cart.getTotalOfProducts();
        }

        return totalOfProductsInCart;
    }
}

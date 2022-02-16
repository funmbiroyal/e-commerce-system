package com.myProject.ecommerce.system.service;

import com.myProject.ecommerce.system.data.dto.CartDto;
import com.myProject.ecommerce.system.data.model.Cart;
import com.myProject.ecommerce.system.data.model.Product;
import com.myProject.ecommerce.system.data.repository.CartRepository;
import com.myProject.ecommerce.system.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    ProductServiceImpl productServiceImpl;
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;

    @Override
    public Cart createCart(CartDto cartDto) {
        Cart cart = new Cart();
        cart.setCartName(cartDto.getCartName());
        return cartRepository.save(cart);
    }

    @Override
    public void addProduct(Long cartId,Product productToBeAdded){
        Cart foundCart = cartRepository.findById(cartId).orElseThrow(() -> new NoSuchElementException(""));
        foundCart.addProduct(productToBeAdded);
        cartRepository.save(foundCart);
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
    public Long getNumberOfProductsInCart(Long cartId) {
        long numberOfProductsInCart = 0;
        Cart cart = cartRepository.findById(cartId).orElse(null);
//        if (cart != null) {
//            numberOfProductsInCart = cart.getNumberOfProducts();
//        }
        return numberOfProductsInCart;

    }


    @Override
    public List<Product> findProductsInCart(Long cartId) {
        Optional<Cart> cartOptional = cartRepository.findById(cartId);
        Cart theCart = null;
        if (cartOptional.isPresent()) {
             theCart = cartOptional.get();
        }else{
            throw new NoSuchElementException("No product found");
        }
        return theCart.getProducts();

    }



    @Override
    public List<Product> getTotalOfProductsInCart() {
        return productRepository.findAll();
    }
}

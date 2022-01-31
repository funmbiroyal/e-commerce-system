package com.myProject.ecommerce.system.data.repository;

import com.myProject.ecommerce.system.data.model.CartWithProducts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartWithProductsRepository extends JpaRepository<CartWithProducts,Long> {

    List<CartWithProductsRepository> getCartWithProductsByCartId(Long cartId);
    void deleteCartWithProductsByCartId(Long cartId); 
}

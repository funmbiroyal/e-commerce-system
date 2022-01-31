package com.myProject.ecommerce.system.data.repository;

import com.myProject.ecommerce.system.data.dto.CartDto;
import com.myProject.ecommerce.system.data.model.Cart;
import com.myProject.ecommerce.system.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {

}

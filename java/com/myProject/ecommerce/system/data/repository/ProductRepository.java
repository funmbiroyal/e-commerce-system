package com.myProject.ecommerce.system.data.repository;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductByName(String name);
    Product findByCost(int cost);
}

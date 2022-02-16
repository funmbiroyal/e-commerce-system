package com.myProject.ecommerce.system.data.repository;

import com.myProject.ecommerce.system.data.model.Seller;
import com.myProject.ecommerce.system.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<User,Long> {
}

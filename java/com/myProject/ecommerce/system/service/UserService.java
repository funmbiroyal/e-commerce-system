package com.myProject.ecommerce.system.service;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Product;
import com.myProject.ecommerce.system.data.model.User;
import com.myProject.ecommerce.system.data.model.UserRole;

import java.util.List;


public interface UserService {
    User register(UserRole role , String password);
    boolean login(UserRole role, String password);
    void setPassword(String password);
    void changePassword(UserRole role,String oldPassword, String newPassword);
    void addProduct(Product product);
   List<Product> getAllProducts();
    void deleteProduct(UserRole role, Long productId,String password);
}

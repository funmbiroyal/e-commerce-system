package com.myProject.ecommerce.system.service;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Product;
import com.myProject.ecommerce.system.exceptions.ProductAlreadyExistsException;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Product addProduct(Product product) throws ProductAlreadyExistsException;
//    Product updateProduct(Long id,String name, int cost,String description);
//    Product updateProduct(Long id, String description);
    Product updateProduct(Long id , ProductDto productDto);

    boolean removeProduct(Long id);

}

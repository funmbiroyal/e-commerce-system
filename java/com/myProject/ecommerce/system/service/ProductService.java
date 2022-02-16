package com.myProject.ecommerce.system.service;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Product;
import com.myProject.ecommerce.system.exceptions.ProductAlreadyExistsException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface ProductService {
    Product createProduct(Product product) throws ProductAlreadyExistsException;
    List<Product> getAllProducts();
    Product getProduct(Long id);
    Product updateProduct(Long id , ProductDto productDto);

    boolean removeProduct(Long id);

    String uploadImage(MultipartFile file) throws IOException;
}

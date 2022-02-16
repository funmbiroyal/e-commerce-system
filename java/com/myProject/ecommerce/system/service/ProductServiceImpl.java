package com.myProject.ecommerce.system.service;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Product;
import com.myProject.ecommerce.system.data.repository.ProductRepository;
import com.myProject.ecommerce.system.exceptions.ProductAlreadyExistsException;
import com.myProject.ecommerce.system.exceptions.ProductNotFoundException;
import com.myProject.ecommerce.system.exceptions.UpdateProductException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    CloudinaryImageUploadService cloudinaryImageUploadService;

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) throws ProductAlreadyExistsException {
        ProductDto productDto = ProductDto.builder().name("bag").description("fashion bag").cost(500).build();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setCost(productDto.getCost());
    return productRepository.save(product);

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        Optional<Product>productOptional = productRepository.findById(id);
        if (productOptional.isPresent()){
            return productOptional.get();
        }
        throw new ProductNotFoundException("No product found with that id");
    }

    @Override
    public Product updateProduct(Long id, ProductDto productDto) {
        Product existingProduct;
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isEmpty())
            throw new UpdateProductException("No product found with that id");

        existingProduct = productOptional.get();
        if(!(productDto.getName() == null)){
            existingProduct.setName(productDto.getName());
        }
        if(!(productDto.getCost() == 0)){
            existingProduct.setCost(productDto.getCost());
        }
        if(!(productDto.getDescription() == null)){
            existingProduct.setDescription(productDto.getDescription());
        }
        return productRepository.save(existingProduct);
    }

    @Override
    public boolean removeProduct(Long id) {
        productRepository.deleteById(id);
        return true;
    }
    @Override
    public String uploadImage(MultipartFile file) throws IOException {
        return cloudinaryImageUploadService.uploadImage(file);
    }
}


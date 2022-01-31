package com.myProject.ecommerce.system.service;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Product;
import com.myProject.ecommerce.system.data.repository.ProductRepository;
import com.myProject.ecommerce.system.exceptions.ProductAlreadyExistsException;
import com.myProject.ecommerce.system.exceptions.UpdateProductException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public Product addProduct(Product product) throws ProductAlreadyExistsException {

        return productRepository.save(product);

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


    }


package com.myProject.ecommerce.system.controller;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Product;
import com.myProject.ecommerce.system.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product) {

        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto) {
        return new ResponseEntity <>(productService.updateProduct(id, productDto),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeProduct(@PathVariable Long id) {
        return new ResponseEntity<>(productService.removeProduct(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        return  new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }
    @PostMapping("/upload")
    public ResponseEntity<?> uploadImage(@RequestParam MultipartFile multipartFile){
        return multipartFile.isEmpty() ?
                new ResponseEntity<String>(HttpStatus.NOT_FOUND): new ResponseEntity<String>(HttpStatus.OK);

    }
}

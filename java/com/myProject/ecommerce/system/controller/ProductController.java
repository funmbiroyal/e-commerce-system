package com.myProject.ecommerce.system.controller;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import com.myProject.ecommerce.system.data.model.Product;
import com.myProject.ecommerce.system.service.ProductService;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
  @PostMapping
    public ResponseEntity<?>addProduct(@RequestBody ContentType type ,Product product){

      return ResponseEntity.ok().body(productService.addProduct(product));
    }
    @PutMapping
    public ResponseEntity<?>updateProduct(Long id, @RequestBody ProductDto productDto){
      return ResponseEntity.ok().body(productService.updateProduct(id,productDto));
    }
    @DeleteMapping
    public ResponseEntity<?>removeProduct(Long id){
      return ResponseEntity.ok().body(productService.removeProduct(id));
    }
}

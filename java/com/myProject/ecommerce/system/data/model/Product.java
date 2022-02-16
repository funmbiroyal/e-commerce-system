package com.myProject.ecommerce.system.data.model;

import com.myProject.ecommerce.system.data.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(length = 20)
    private String description;
    private int cost;
//    private String image;

    public Product createProduct(Product product){
        ProductDto productDto = ProductDto.builder().name("bag").description("fashion bag").cost(500).build();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setCost(productDto.getCost());
        return product;

    }
}

package com.myProject.ecommerce.system.data.dto;

import com.myProject.ecommerce.system.data.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    @Id
    private Long id;
    @OneToOne
    private Product product;
    private String name;
    private int cost;
    private String description;
    private String image;




}

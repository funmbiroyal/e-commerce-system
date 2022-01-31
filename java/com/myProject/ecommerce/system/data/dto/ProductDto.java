package com.myProject.ecommerce.system.data.dto;

import com.myProject.ecommerce.system.data.model.Product;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Data
public class ProductDto {
    @Id
    private String id;
    @OneToOne
    private Product product;
    private String name;
    private int cost;
    private String description;
    private String image;




}

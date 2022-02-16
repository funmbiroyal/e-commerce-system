package com.myProject.ecommerce.system.data.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue()
    private Long id;
    @OneToMany
    private List<Product> products;
    private String cartName;

    public void addProduct(Product createdProduct){
        products = new ArrayList<>();
        products.add(createdProduct);
    }
}

package com.myProject.ecommerce.system.data.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Entity
@Data
public class Cart {
    @Id
    private Long id;
    @ManyToOne
    private Product product;
    private int numberOfProducts;
    private int totalOfProducts;
}

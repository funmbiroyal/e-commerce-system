package com.myProject.ecommerce.system.data.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CartWithProducts {
    @Id
    @Column(name = "cartId", nullable = false)
    private Long cartId;
    private Long productId;
    private int productCost;


}

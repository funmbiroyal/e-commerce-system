package com.myProject.ecommerce.system.data.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CartDto {
    @Id
    private Long id;
    private int numberOfProduct;
    private int totalOfProduct;

}

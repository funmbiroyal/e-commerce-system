package com.myProject.ecommerce.system.data.dto;

import com.myProject.ecommerce.system.data.model.Product;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    @Id
    private Long id;
    private String cartName;
//    @OneToMany
//    private List<Product> products = new ArrayList<>();
//    private int numberOfProduct;
//    private int totalOfProduct;

}

package com.myProject.ecommerce.system.data.dto;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
public class ImageDto {
    @Id
    private String url;

}

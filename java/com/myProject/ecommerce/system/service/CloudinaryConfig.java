package com.myProject.ecommerce.system.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ComponentScan
public class CloudinaryConfig {
    @Value("${com.cloudinary.cloud_name}")
    private String name;

    @Value("${com.cloudinary.api_key}")
    private String key;

    @Value("${com.cloudinary.api_secret}")
    private String secret;


}

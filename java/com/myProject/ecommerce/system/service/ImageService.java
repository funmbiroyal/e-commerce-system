package com.myProject.ecommerce.system.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public interface ImageService {
    String uploadImage(MultipartFile file) throws IOException;
    String getImage();
//    Map<String ,String>configure();
}

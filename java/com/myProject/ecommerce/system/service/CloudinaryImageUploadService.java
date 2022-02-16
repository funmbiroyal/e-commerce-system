package com.myProject.ecommerce.system.service;


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryImageUploadService implements ImageService{

    @Autowired
    private CloudinaryConfig cloudinaryConfig;

    @Override
    public String uploadImage(MultipartFile file) throws IOException {
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", cloudinaryConfig.getName(),
                "api_key", cloudinaryConfig.getKey(),
                "api_secret", cloudinaryConfig.getSecret()
        )
        );
        Map<?, ?> map = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());


        return map.get("url").toString();
    }

    @Override
    public String getImage() {
        return null;
    }
}

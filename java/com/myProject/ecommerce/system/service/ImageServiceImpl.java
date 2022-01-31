package com.myProject.ecommerce.system.service;

import lombok.extern.slf4j.Slf4j;


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
public class ImageServiceImpl implements ImageService {
    @Override
    public String uploadImage(MultipartFile file) throws IOException {
        Cloudinary cloudinary = new Cloudinary(configure());
        File convertedImage = new File(Objects.requireNonNull(file.getOriginalFilename()));
            file.transferTo(convertedImage);

        Map uploadResult = null;

            uploadResult = cloudinary.uploader().upload(convertedImage, new HashMap());


//        convertedImage.delete();
        return (String) uploadResult.get("secure_url");
//        Map result = cloudinary.api().resource("sample", ObjectUtils.emptyMap());
//
//        File fileToUpload = new File("bag.jpg");
//        try {
//            cloudinary.uploader().upload(fileToUpload , ObjectUtils.emptyMap());
//        } catch (IOException e) {
//            log.info("Exception occurred due to ->{}",e.getMessage());
//        }

    }

    @Override
    public String getImage() {
        return null;
    }

    private Map<String, String> configure() {
            Map<String, String> cloudMap = new HashMap<>();
            cloudMap.put("cloud_name", "drpsw6aea");
            cloudMap.put("api_key", "656486393863995");
            cloudMap.put("api_secret", "Yn1ocDHgMUVPGS4L58oukwMzlqA");
        return cloudMap;

    }

}


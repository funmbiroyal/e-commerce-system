package com.myProject.ecommerce.system.exceptions;

public class ProductAlreadyExistsException extends RuntimeException {

    public ProductAlreadyExistsException(String s){
        super(s);

    }
}

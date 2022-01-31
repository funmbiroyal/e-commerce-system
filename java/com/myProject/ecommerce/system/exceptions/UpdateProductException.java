package com.myProject.ecommerce.system.exceptions;

public class UpdateProductException extends RuntimeException{
    public UpdateProductException(String message){
        super (message);
    }
}

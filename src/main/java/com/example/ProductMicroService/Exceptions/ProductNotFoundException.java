package com.example.ProductMicroService.Exceptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String msg)
    {
        super(msg);
    }
}

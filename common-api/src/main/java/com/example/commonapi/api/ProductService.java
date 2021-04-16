package com.example.commonapi.api;

import com.example.commonapi.dto.ProductAddReq;

import javax.validation.Valid;

public interface ProductService {

    public String addProduct(@Valid ProductAddReq productAddReq);
}

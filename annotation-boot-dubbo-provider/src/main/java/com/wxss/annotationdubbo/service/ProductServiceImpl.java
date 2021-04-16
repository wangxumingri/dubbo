package com.wxss.annotationdubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.commonapi.api.ProductService;
import com.example.commonapi.dto.ProductAddReq;

import java.util.Random;

@Service(group = "local", validation = "true") // 服务端开启参数验证
//@Service(group = "local")
public class ProductServiceImpl implements ProductService {
    @Override
    public String addProduct(ProductAddReq productAddReq) {
        return new Random().nextInt(2) + "";
    }
}

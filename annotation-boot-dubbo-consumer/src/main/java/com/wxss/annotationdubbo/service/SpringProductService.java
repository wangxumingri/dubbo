package com.wxss.annotationdubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.commonapi.api.ProductService;
import com.example.commonapi.dto.ProductAddReq;
import com.wxss.annotationdubbo.vo.ProductAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class SpringProductService {
//    @Reference(group = "local",validation = "true") // 开启消费端参数校验
    @Reference(group = "local")
    private ProductService productService;

    public String addProduct(ProductAddVO addVO){
        ProductAddReq request = new ProductAddReq();
        BeanUtils.copyProperties(addVO,request);
        String id = productService.addProduct(request);

        return id;
    }
}

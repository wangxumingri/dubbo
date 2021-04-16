package com.wxss.annotationdubbo.controller;

import com.example.commonapi.dto.LoginReqDto;
import com.example.commonapi.dto.LoginResDto;
import com.wxss.annotationdubbo.common.RestResult;
import com.wxss.annotationdubbo.service.SpringProductService;
import com.wxss.annotationdubbo.service.SpringUserService;
import com.wxss.annotationdubbo.vo.ProductAddVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("")
public class TestController {

    @Autowired
    private SpringUserService springUserService;

    @Autowired
    private SpringProductService springProductService;


    @RequestMapping("login")
    public LoginResDto login(@RequestBody LoginReqDto loginReqDto) {
        return springUserService.login(loginReqDto);
    }

    @RequestMapping("add")
    public String addProduct(@RequestBody ProductAddVO addVO) {
        RestResult r = RestResult.success(000000, "请求成功", true, null);

        System.out.println(r);
        String id = springProductService.addProduct(addVO);

        return id;
    }
}

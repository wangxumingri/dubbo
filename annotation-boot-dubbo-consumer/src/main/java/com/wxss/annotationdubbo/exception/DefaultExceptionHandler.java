package com.wxss.annotationdubbo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class DefaultExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Map<String,Object> handlerRpcException(Exception e){
        e.printStackTrace();

        Map<String, Object> result = new HashMap<>();
        result.put("code",999999);
        result.put("msg","系统异常" );
        result.put("data",null);

        return result;
    }
}

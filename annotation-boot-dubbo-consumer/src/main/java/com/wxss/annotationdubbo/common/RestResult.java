package com.wxss.annotationdubbo.common;

import java.util.HashMap;

public class RestResult extends HashMap<String,Object> {
    private static final String KEY_CODE = "code";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_SUCCESS = "success";
    private static final String KEY_DATA = "data";

    public static RestResult success(Integer code,String message,Boolean success,Object data ){
        RestResult restResult = new RestResult();
        restResult.put(KEY_CODE,code);
        restResult.put(KEY_MESSAGE,message);
        restResult.put(KEY_SUCCESS,success);
        restResult.put(KEY_DATA,data);


        return restResult;
    }
}

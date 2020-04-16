package com.example.commonprovider.service;

import com.example.commonapi.api.UserService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @package: com.example.commonprovider.service
 * @describe:
 * @author: ANGYU
 * @date: 2020-04-16 14:38
 */
//@Service
@Component("userService")
public class UserServiceImpl implements UserService {
    @Override
    public Map<String, Object> login(String username, String passwordd) {
        Map<String,Object> result = new HashMap<>(3);
        result.put("success",true);

        return result;
    }
}

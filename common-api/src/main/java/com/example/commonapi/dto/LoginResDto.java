package com.example.commonapi.dto;

import java.io.Serializable;

/**
 * @Author: wxss
 * @Date: 2020/12/07
 * @Description:
 */
public class LoginResDto implements Serializable {
    private String userId;
    private String username;
    private String token;

    public LoginResDto() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginResDto{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}

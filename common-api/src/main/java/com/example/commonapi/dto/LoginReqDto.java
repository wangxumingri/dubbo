package com.example.commonapi.dto;


import java.io.Serializable;

/**
 * @package: com.example.commonapi.dto
 * @describe:
 * @author: wxss
 * @date: 2020-04-16 14:04
 */

public class LoginReqDto implements Serializable {
    private String loginType;
    private String loginId;
    private String password;

    public LoginReqDto() {
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginReqDto{" +
                "loginType='" + loginType + '\'' +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

package com.example.commonapi.dto;

import java.util.Date;

/**
 * @package: com.example.commonapi.dto
 * @describe:
 * @author: ANGYU
 * @date: 2020-04-16 14:04
 */

public class UserDto {
    private String username;
    private String realName;
    private String password;
    private Integer age;
    private Date birthday;

    public UserDto() {
    }

    public UserDto(String username, String realName, String password, Integer age, Date birthday) {
        this.username = username;
        this.realName = realName;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}

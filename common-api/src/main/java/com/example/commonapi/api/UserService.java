package com.example.commonapi.api;

        import com.example.commonapi.dto.UserDto;

        import java.util.Map;

public interface UserService {
    Map<String,Object> login(String username, String passwordd);
}

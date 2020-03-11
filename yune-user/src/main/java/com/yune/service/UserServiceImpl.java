package com.yune.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yune.dto.UserDto;
import com.yune.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Value("${sp.user-service.users}")
    private String userJson;


    @Override
    public UserDto getUser(Integer id) {
        log.info("users json string : "+userJson);
        List<UserDto> list = JsonUtil.from(userJson, new TypeReference<List<UserDto>>() {
        });
        for (UserDto user:list){
            if (user.getId().equals(id)){
                return user;
            }
        }
        return new UserDto();
    }

    @Override
    public void addScore(Integer id, Integer score) {

        // 这里增加积分
        log.info("user "+id+" - 增加积分 "+score);
    }
}

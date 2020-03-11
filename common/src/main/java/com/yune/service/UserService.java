package com.yune.service;

import com.yune.dto.UserDto;

public interface UserService {

    UserDto getUser(Integer id);

    void addScore(Integer id, Integer score);
}

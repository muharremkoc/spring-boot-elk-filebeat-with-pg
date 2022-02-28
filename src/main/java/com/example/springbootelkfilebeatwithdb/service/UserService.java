package com.example.springbootelkfilebeatwithdb.service;

import com.example.springbootelkfilebeatwithdb.dto.UserRequestDto;
import com.example.springbootelkfilebeatwithdb.model.User;

public interface UserService {

    User saveUser(UserRequestDto userRequestDto);

    void deleteUser(String id);

    User getUser(String id);
}

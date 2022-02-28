package com.example.springbootelkfilebeatwithdb.mapper;

import com.example.springbootelkfilebeatwithdb.dto.UserRequestDto;
import com.example.springbootelkfilebeatwithdb.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User userRequestDtoToUser(UserRequestDto userRequestDto);
}

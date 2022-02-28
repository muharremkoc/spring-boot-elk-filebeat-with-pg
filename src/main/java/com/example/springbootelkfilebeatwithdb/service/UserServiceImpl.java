package com.example.springbootelkfilebeatwithdb.service;

import com.example.springbootelkfilebeatwithdb.dto.UserRequestDto;
import com.example.springbootelkfilebeatwithdb.mapper.UserMapper;
import com.example.springbootelkfilebeatwithdb.model.User;
import com.example.springbootelkfilebeatwithdb.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService{

    final UserRepository userRepository;

    final UserMapper userMapper;

    @Override
    public User saveUser(UserRequestDto userRequestDto) {

        User user=userMapper.userRequestDtoToUser(userRequestDto);

        log.info("User has saved: New User's name:"+user.getFirstName()+" New User's lastname:"+user.getLastName());

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {
          User user=userRepository.findById(id).orElseThrow();
          userRepository.deleteById(id);
        log.info("User's ID:"+id+"User's name:"+user.getFirstName()+" User's lastname:"+user.getLastName()+" was Deleted");

    }

    @Override
    public User getUser(String id) {
       User user=userRepository.findById(id).orElseThrow();
        log.info("User's Selected:"+"User's ID:"+user.getId()+"User's name:"+user.getFirstName()+"User's lastname:"+user.getLastName()+"was Deleted");
       return user;
    }
}

package com.example.springbootelkfilebeatwithdb.controller;

import com.example.springbootelkfilebeatwithdb.dto.UserRequestDto;
import com.example.springbootelkfilebeatwithdb.model.User;
import com.example.springbootelkfilebeatwithdb.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/elk")
public class UserController {

    final UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody UserRequestDto userRequestDto){
        return userService.saveUser(userRequestDto);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") String id){
         userService.deleteUser(id);
    }
}

package com.example.springbootelkfilebeatwithdb.repository;

import com.example.springbootelkfilebeatwithdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}

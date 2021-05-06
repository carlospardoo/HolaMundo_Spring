package com.example.demo.dao;

import java.util.Optional;

import com.example.demo.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserDao extends CrudRepository <User, Long>{
    User findByUsername(String username);
    Optional<User> findById(Long id);
}

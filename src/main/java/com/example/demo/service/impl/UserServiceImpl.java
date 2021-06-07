package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserDao userDao;

    @Override
    public User save(UserDto infoUsuario) {
        User userToSave = infoUsuario.getUserFromDto();
        return userDao.save(userToSave);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public User findOne(String username) {
        return userDao.findByUsername(username);
    }

    public User alterSave(User infoUsuario) {
        return userDao.save(infoUsuario);
    }
}

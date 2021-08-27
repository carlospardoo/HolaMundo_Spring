package com.example.demo.dto;

import com.example.demo.model.User;

public class UserDto{

    private String username;

    private String password;//No debe ir

    private String name;

    private String color;
    

    public UserDto(String color, String name, String username, String password){
        super();
        this.color = color;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public User getUserFromDto(){
        User user = new User();
        user.setColor(this.color);
        user.setUsername(this.username);
        user.setName(this.name);
        return user;
    }
}

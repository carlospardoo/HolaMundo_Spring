package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;

@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autogenerado
    private long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;


}

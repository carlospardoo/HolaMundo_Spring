package com.example.demo.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autogenerado
    private long id;

    @Column(unique = true) //unique valida columna sea unica
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @Column 
    private String color;

    @ManyToMany(fetch = FetchType.EAGER)//fetch especifica como se trae la info
    
    @JoinTable(
        name               = "USER_ROLES", 
        joinColumns        = { @JoinColumn(name = "USER_ID") },
        inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") }
    )
    private Set<Role> roles;

    /* */
    @OneToMany(mappedBy = "user_id")
    private List <Nota> notas;
    /* */

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

    
}


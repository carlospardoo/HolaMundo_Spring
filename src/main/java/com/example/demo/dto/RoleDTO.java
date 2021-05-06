package com.example.demo.dto;

import com.example.demo.model.Role;

public class RoleDTO {
    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Role getRoleFromDTO(){
        Role rol = new Role();
        rol.setName(this.name);
        rol.setDescription(this.description);

        return rol;
    }
    
}

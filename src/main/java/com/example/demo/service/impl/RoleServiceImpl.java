package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.dao.RoleDao;
import com.example.demo.model.Role;
import com.example.demo.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role save(Role infoRole) {
        return roleDao.save(infoRole);
    }

    @Override
    public List<Role> findAll() {
        return (List<Role>) roleDao.findAll();
    }

    @Override
    public Role findOne(String role) {
        return roleDao.findRoleByName(role);
    }
    
}

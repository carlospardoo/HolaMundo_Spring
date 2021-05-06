package com.example.demo.dao;

import java.util.Optional;

import com.example.demo.model.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,Long>{
    Role findRoleByName(String name);
    Optional<Role> findById(Long id);
}

package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Nota;
import com.example.demo.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaDAO extends CrudRepository <Nota,Long> {
    List <Nota> findByUser(User user);
}

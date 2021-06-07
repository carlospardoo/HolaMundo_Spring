package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.dao.NotaDAO;
import com.example.demo.model.Nota;
import com.example.demo.model.User;
import com.example.demo.service.NotaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "notaService")
public class NotaServiceImpl implements NotaService{

    @Autowired
    private NotaDAO notaDAO;

    @Override
    public Nota save(Nota notaData) {
        return notaDAO.save(notaData);
    }

    List <Nota> findByUser(User user){
        return notaDAO.findByUser(user);
    }
    
}

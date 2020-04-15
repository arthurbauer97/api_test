package com.example.testeapp.services;

import com.example.testeapp.domain.Funcionario;
import com.example.testeapp.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repo;

    public Funcionario buscar(Integer id){
        Optional<Funcionario> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public List<Funcionario> all(){
       List<Funcionario> list = repo.findAll();
        return list;
    }
}

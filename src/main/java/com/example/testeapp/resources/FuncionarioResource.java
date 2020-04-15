package com.example.testeapp.resources;

import com.example.testeapp.domain.Funcionario;
import com.example.testeapp.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FuncionarioResource {

    @Autowired
    private FuncionarioService service;

    @GetMapping(value = "/funcionario/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {

        Funcionario obj = service.buscar(id);

        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/funcionarios")
    public ResponseEntity<?> getAll() {

        List<Funcionario> listObjects = service.all();

        return ResponseEntity.ok().body(listObjects);
    }

}

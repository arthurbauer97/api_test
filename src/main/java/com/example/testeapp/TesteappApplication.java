package com.example.testeapp;

import com.example.testeapp.domain.Funcionario;
import com.example.testeapp.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
@RestController
public class TesteappApplication implements CommandLineRunner {

	@Autowired
	private FuncionarioRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(TesteappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Funcionario arthur = new Funcionario("Arthur");
		Funcionario preto = new Funcionario("Preto");
		Funcionario ney = new Funcionario("Ney");
		Funcionario bolachudo = new Funcionario("Bolacha");
		Funcionario arthurxd = new Funcionario("Arthur xD");

		repo.saveAll(Arrays.asList(arthur,preto,bolachudo,ney,arthurxd));
	}
}

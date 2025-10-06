package com.example.demoh2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoh2.model.Curso;
import com.example.demoh2.repository.CursoRepository;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    private final CursoRepository repo;

    public CursoController(CursoRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Curso> listar(){
        return repo.findAll();
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso){
        return repo.save(curso);
    }

}

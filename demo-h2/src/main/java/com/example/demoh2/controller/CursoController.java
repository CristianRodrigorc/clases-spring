package com.example.demoh2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoh2.dto.CursoDTO;
import com.example.demoh2.model.Curso;
import com.example.demoh2.repository.CursoRepository;
import com.example.demoh2.service.EntityToDtoService;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    private final CursoRepository repo;
    private final EntityToDtoService entityToDtoService;

    public CursoController(CursoRepository repo, EntityToDtoService entityToDtoService){
        this.repo = repo;
        this.entityToDtoService = entityToDtoService;
    }

    @GetMapping
    public List<CursoDTO> listar(){
        List<Curso> cursos = repo.findAll();
        return entityToDtoService.convertirACursosDTO(cursos);
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso){
        return repo.save(curso);
    }

    
}

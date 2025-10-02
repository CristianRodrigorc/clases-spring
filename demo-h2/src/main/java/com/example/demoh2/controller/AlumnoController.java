package com.example.demoh2.controller;

import com.example.demoh2.model.Alumno;
import com.example.demoh2.repository.AlumnoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    private final AlumnoRepository repo;

    public AlumnoController(AlumnoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Alumno> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return repo.save(alumno);
    }
}

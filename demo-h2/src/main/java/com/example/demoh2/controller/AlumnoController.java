    package com.example.demoh2.controller;

import com.example.demoh2.dto.AlumnoDTO;
import com.example.demoh2.model.Alumno;
import com.example.demoh2.repository.AlumnoRepository;
import com.example.demoh2.service.EntityToDtoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    private final AlumnoRepository repo;
    private final EntityToDtoService entityToDtoService;


    public AlumnoController(AlumnoRepository repo, EntityToDtoService entitytoDTO, EntityToDtoService entityToDtoService) {
        this.repo = repo;
        this.entityToDtoService = entityToDtoService;
    }

    @GetMapping
    public List<AlumnoDTO> listar() {
        List <Alumno> alumnos = repo.findAll();
        return entityToDtoService.convertirAAlumnosDTO(alumnos);
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return repo.save(alumno);
    }
}

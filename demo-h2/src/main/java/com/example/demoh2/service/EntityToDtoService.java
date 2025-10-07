package com.example.demoh2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demoh2.dto.AlumnoDTO;
import com.example.demoh2.dto.CursoDTO;
import com.example.demoh2.model.Alumno;
import com.example.demoh2.model.Curso;

@Service
public class EntityToDtoService {

    public AlumnoDTO convertirAAlumnoDTO(Alumno alumno){
        return new AlumnoDTO(alumno.getId(),alumno.getNombre(),alumno.getCurso().getId());
    }

    public List<AlumnoDTO> convertirAAlumnosDTO(List <Alumno> alumnos){
        return alumnos.stream()
                .map(this::convertirAAlumnoDTO)
                .collect(Collectors.toList());
    }



    public CursoDTO convertirACursoDTO(Curso curso){
        return new CursoDTO(curso.getId(),curso.getNombre(),curso.getProfesor(),curso.getHoras());
    }

    public List<CursoDTO> convertirACursosDTO(List <Curso> cursos){
        return cursos.stream()
                .map(this::convertirACursoDTO)
                .collect(Collectors.toList());
    }
}

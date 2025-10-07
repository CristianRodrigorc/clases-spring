package com.example.demoh2.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demoh2.dto.AlumnoDTO;

public class AlumnoDTOTest {
    
    @Test
    void testConstructor(){
        AlumnoDTO alumno = new AlumnoDTO(2L, "yo", 1L);

        assertEquals(2L,alumno.id());
        assertEquals("yo", alumno.nombre());
        assertEquals(1l,alumno.curso_id());
    }

    @Test
    void testAlumnoDTONotEquals() {
        
        AlumnoDTO alumnoDTO1 = new AlumnoDTO(1L, "Juan Pérez", 101L);
        AlumnoDTO alumnoDTO2 = new AlumnoDTO(2L, "María López", 102L);

        assertNotEquals(alumnoDTO1, alumnoDTO2);
    }
}

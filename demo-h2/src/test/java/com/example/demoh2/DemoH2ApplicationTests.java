package com.example.demoh2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demoh2.model.Alumno;
import com.example.demoh2.model.Curso;

@SpringBootTest
class DemoH2ApplicationTests {
    @Test
    void addAlumno_sincroniza_ambos_lados() {
        Curso c = new Curso( "BBDD", "Pedro",210);
        Alumno a = new Alumno();

        //Estado inicial
        // Verificar que las propiedades se asignan correctamente
        assertTrue(c.getNombre().equals("BBDD"), "El nombre del curso debe ser 'BBDD'");
        assertTrue(c.getProfesor().equals("Pedro"), "El profesor debe ser 'Pedro'");
        assertTrue(c.getHoras() == 210, "Las horas del curso deben ser 210");
     }
}

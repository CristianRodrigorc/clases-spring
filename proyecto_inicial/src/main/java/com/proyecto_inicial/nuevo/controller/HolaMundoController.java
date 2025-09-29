package com.proyecto_inicial.nuevo.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto_inicial.nuevo.utils.LectorDoc;

@RestController
public class HolaMundoController {
    
    @GetMapping("/contar-palabras")
    public Map<String,Integer> cantidadPalabras(){
        int valor = LectorDoc.contadoLineas();
        return Collections.singletonMap("numero", valor);
    }
}

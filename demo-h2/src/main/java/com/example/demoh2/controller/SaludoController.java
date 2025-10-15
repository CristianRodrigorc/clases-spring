package com.example.demoh2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping("/api/saludos")
    public String saludos(){
        return "Hola Mundo";
    }
}

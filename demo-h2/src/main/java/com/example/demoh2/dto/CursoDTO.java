package com.example.demoh2.dto;

import org.springframework.validation.annotation.Validated;

@Validated
public record CursoDTO(String nombre, String profesor, int horas) {}

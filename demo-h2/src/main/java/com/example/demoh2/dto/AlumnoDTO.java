package com.example.demoh2.dto;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;


@Validated
public record AlumnoDTO(@NotNull String nombre, Long curso_id) {}

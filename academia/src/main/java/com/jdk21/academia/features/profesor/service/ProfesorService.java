package com.jdk21.academia.features.profesor.service;

import org.springframework.stereotype.Service;

import com.jdk21.academia.domain.Profesor;
import com.jdk21.academia.features.profesor.repository.ProfesorRepository;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProfesorService {

    private final ProfesorRepository profesorRepository;

    
}

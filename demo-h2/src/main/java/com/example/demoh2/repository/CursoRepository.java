package com.example.demoh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoh2.model.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long>{}

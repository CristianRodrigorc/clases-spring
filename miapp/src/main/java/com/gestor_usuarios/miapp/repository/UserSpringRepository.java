package com.gestor_usuarios.miapp.repository;

import com.gestor_usuarios.miapp.model.UserSpring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSpringRepository extends JpaRepository<UserSpring, Long> {
}
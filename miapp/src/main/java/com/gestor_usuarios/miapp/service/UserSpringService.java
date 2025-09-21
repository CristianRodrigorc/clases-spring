package com.gestor_usuarios.miapp.service;

import org.springframework.stereotype.Service;
import com.gestor_usuarios.miapp.repository.UserSpringRepository;
import com.gestor_usuarios.miapp.model.UserSpring;

import java.util.List;

@Service
public class UserSpringService {

    private final UserSpringRepository repository;

    public UserSpringService(UserSpringRepository repository){
        this.repository = repository;
    }

    public List<UserSpring> getAllUsers(){
        return repository.findAll();
    }

    public UserSpring saveUser(UserSpring user){
        return repository.save(user);
    }

    public UserSpring getUserById(Long id){
        return repository.findById(id).orElse(null);
    }

    public void deleteUser(Long id){
        repository.deleteById(id);
    }
    

}

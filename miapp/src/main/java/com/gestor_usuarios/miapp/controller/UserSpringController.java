package com.gestor_usuarios.miapp.controller;

import com.gestor_usuarios.miapp.model.UserSpring;
import com.gestor_usuarios.miapp.service.UserSpringService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserSpringController {

    private final UserSpringService userSpringService;

    public UserSpringController(UserSpringService service){
        this.userSpringService = service;
    }

    @GetMapping
    public List<UserSpring> getAllUsers(){
        return userSpringService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserSpring getUserById(@PathVariable Long id){
        return userSpringService.getUserById(id);
    }

    @PostMapping
    public UserSpring createUser(@RequestBody UserSpring user){
        return  userSpringService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userSpringService.deleteUser(id);
    }
}

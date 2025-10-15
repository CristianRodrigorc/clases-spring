package com.example.demoh2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; // (BCrypt — algoritmo de cifrado)
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration //Clase de configuración de spring
public class SegurityConfig {

    @Bean
    SecurityFilterChain segurityFilterChain (HttpSecurity http) throws Exception{
        http
        .csrf(csrf -> csrf.disable())//(CSRF — desactivado en APIs stateless)
        .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))//(stateless)
        .authorizeHttpRequests(
            auth -> auth
            .requestMatchers("/publico/**","/h2.console/**").permitAll()
            .requestMatchers("/api/admin/**").hasRole("ADMIN")
            .requestMatchers("/api/alumnos/**","/api/cursos/**").authenticated()
            .anyRequest().authenticated()
        )
        .httpBasic(Customizer.withDefaults());//(HTTP Basic - user:pass en cabecera)

        //H2 console (opcional)
        http.headers(headers -> headers.frameOptions(frame -> frame.disable()));

        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    UserDetailsService userDetailsService(PasswordEncoder encoder){
        var user =  User.withUsername("alumno")
            .password(encoder.encode("1234"))
            .roles("USER")//(RBAC - control de acceso por roles)
            .build();
        
        var admin = User.withUsername("profe")
        .password(encoder.encode("admin"))
        .roles("ADMIN")
        .build();

        return new InMemoryUserDetailsManager(user,admin);//usuarios en memoria para la demo
    }
}

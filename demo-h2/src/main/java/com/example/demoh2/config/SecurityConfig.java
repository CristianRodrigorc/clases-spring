package com.example.demoh2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests()  // Usar authorizeHttpRequests() en lugar de authorizeRequests()
                .requestMatchers("/login", "/register").permitAll()  // Usar requestMatchers en lugar de antMatchers
                .anyRequest().authenticated()  // Requiere autenticación para el resto de las URLs
            .and()
            .formLogin()
                .loginPage("/login")  // Página personalizada de login
                .permitAll()
            .and()
            .logout()
                .permitAll();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Para cifrado de contraseñas
    }
    
     @Bean
    public UserDetailsService userDetailsService() {
        UserBuilder users = User.withDefaultPasswordEncoder();  // Usa el codificador por defecto para pruebas
        return new InMemoryUserDetailsManager(
            users.username("user").password("password").roles("USER").build(),
            users.username("admin").password("admin").roles("ADMIN").build()
        );
}

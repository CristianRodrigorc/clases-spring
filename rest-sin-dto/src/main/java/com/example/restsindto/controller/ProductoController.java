package com.example.restsindto.controller;

import com.example.restsindto.domain.Producto;
import com.example.restsindto.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Producto> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Producto obtener(@PathVariable("id") Long id) {
        return service.obtener(id);
    }

    @PostMapping
    public ResponseEntity<Producto> crear(@Valid @RequestBody Producto p) {
        var creado = service.crear(p);
        return ResponseEntity.created(URI.create("/api/productos/" + creado.getId())).body(creado);
    }
    
    @GetMapping("/rangoid")
    public List<Producto> obtenerPorRangoId(
            @RequestParam(name = "min") Long min,
            @RequestParam(name = "max") Long max) {
        return service.obtenerProductoIdRango(min, max);
    }

    @GetMapping("/rangoprecio")
    public List<Producto> obtenerPorRangoPrecio(
            @RequestParam(name = "min") double min,
            @RequestParam(name = "max") double max) {
        return service.obtenerProductoPrecioRango(min, max);
    }

   @PutMapping("/{id}")
    public Producto actualizar(@PathVariable("id") Long id, @Valid @RequestBody Producto p) {
        return service.actualizar(id, p);
    }

   @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable("id") Long id) {
        service.borrar(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/ping")
    public java.util.Map<String,String> ping() {
        return java.util.Map.of("ok","true");
    }
}

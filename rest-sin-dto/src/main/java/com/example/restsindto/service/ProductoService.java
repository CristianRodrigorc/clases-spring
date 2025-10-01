package com.example.restsindto.service;

import com.example.restsindto.domain.Producto;
import com.example.restsindto.exception.NotFoundException;
import com.example.restsindto.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository repo;

    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }

    public List<Producto> listar() {
        return repo.findAll();
    }

    public Producto obtener(Long id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Producto " + id + " no encontrado"));
    }

    public List<Producto> obtenerProductoIdRango(Long idMin, Long idMax){
        return repo.findByIdRango(idMin,idMax);
    }
    
    public List<Producto> obtenerProductoPrecioRango(Double precioMin, Double precioMax){
        return repo.findByPrecioRango(precioMin,precioMax);
    }

    public Producto crear(Producto p) {
        return repo.save(p);
    }

    public Producto actualizar(Long id, Producto p) {
        Producto existe = obtener(id);
        existe.setNombre(p.getNombre());
        existe.setPrecio(p.getPrecio());
        existe.setStock(p.getStock());
        return repo.save(existe);
    }

    public void borrar(Long id) {
        obtener(id);
        repo.deleteById(id);
    }
}

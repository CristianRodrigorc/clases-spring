package com.example.restsindto.repository;

import com.example.restsindto.domain.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    Producto save(Producto p);
    Optional<Producto> findById(Long id);
    List<Producto> findAll();
    void deleteById(Long id);
    List<Producto> findByPrecioRango(Double precioMin, Double precioMax);
    List<Producto> findByIdRango(Long idMin, Long idMax);
}

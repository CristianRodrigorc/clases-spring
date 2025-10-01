package com.example.restsindto.repository;

import com.example.restsindto.domain.Producto;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryProductoRepository implements ProductoRepository {
    private final Map<Long, Producto> data = new ConcurrentHashMap<>();
    private final AtomicLong seq = new AtomicLong(0);

    public InMemoryProductoRepository() {
        save(new Producto(null, "Cuaderno A4", 3.5, 120));
        save(new Producto(null, "Bolígrafo azul", 1.2, 300));
        save(new Producto(null,"Cuaderno A4 rayado", 2.5, 150));
        save(new Producto(null,"Lápiz HB", 0.5, 500));
        save(new Producto(null,"Regla de 30 cm", 1.0, 200));
        save(new Producto(null,"Marcador permanente negro", 1.8, 120));
        save(new Producto(null,"Tijeras escolares", 2.2, 100));
        save(new Producto(null,"Pegamento en barra 20g", 1.1, 250));
        save(new Producto(null,"Carpeta plástica tamaño carta", 1.4, 180));                                 
        save(new Producto(null,"Goma de borrar blanca", 0.6, 400));
        save(new Producto(null,"Compás metálico", 3.5, 75));
        save(new Producto(null,"Estuche escolar básico", 4.8, 90));
    }

    @Override
    public Producto save(Producto p) {
        if (p.getId() == null) {
            p.setId(seq.incrementAndGet());
        }
        data.put(p.getId(), p);
        return p;
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public List<Producto> findAll() {
        return new ArrayList<>(data.values());
    }

    @Override
    public List <Producto> findByPrecioRango( Double precioMin, Double precioMax){
        List <Producto> rango = new ArrayList<>();
        for (Producto producto : data.values()) {
            if ( producto.getPrecio() >= precioMin && producto.getPrecio() <= precioMax) {
                rango.add(producto);
            }
        }
        return rango;
    }

    @Override
    public List <Producto> findByIdRango( Long idMin, Long idMax){
        List <Producto> rango = new ArrayList<>();
        for (Producto producto : data.values()) {
            Long id = producto.getId();
            System.out.println("Evaluando producto ID: " + id);
            if ( id != null && id.compareTo(idMin) >= 0 && id.compareTo(idMax)<= 0) {
                rango.add(producto);
            }
        }
        return rango;
    }

    @Override
    public void deleteById(Long id) {
        data.remove(id);
    }
}

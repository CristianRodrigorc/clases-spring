package com.example.restsindto;

import com.example.restsindto.domain.Producto;
import com.example.restsindto.repository.InMemoryProductoRepository;
import com.example.restsindto.service.ProductoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoServiceTest {
    @Test
    void crear_y_obtener_producto() {
        var service = new ProductoService(new InMemoryProductoRepository());
        var nuevo = new Producto(null, "Ratón", 9.99, 50);
        var creado = service.crear(nuevo);
        assertNotNull(creado.getId());
        var obtenido = service.obtener(creado.getId());
        assertEquals("Ratón", obtenido.getNombre());
        assertEquals(9.99, obtenido.getPrecio(), 1e-9);
        assertEquals(50, obtenido.getStock());
    }
}

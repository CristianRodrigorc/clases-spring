# REST mínimo sin DTOs
Proyecto didáctico para empezar con Spring Boot exponiendo directamente la entidad (sin DTOs).

## Objetivos
- Cargar, ejecutar y analizar un REST sencillo.
- Probar endpoints con `requests.http`.
- Detectar riesgos de exponer entidades directamente.
- Preparar el terreno para migrar a DTOs después.

## Requisitos
- JDK 21
- Maven 3.9+
- VS Code + REST Client (opcional).

## Ejecutar
```
mvn spring-boot:run
```
API: `http://localhost:8080`.

## Endpoints
- GET /api/productos
- GET /api/productos/{id}
- POST /api/productos
- PUT /api/productos/{id}
- DELETE /api/productos/{id}

## Reto
1) Añade `categoria` a Producto y hazlo funcional en CRUD.
2) GET /api/productos/buscar?nombre=texto (contiene, case-insensitive).
3) Validaciones: nombre [2..60], precio > 0, stock >= 0.
4) (Bonus) Test JUnit creando y consultando un producto.

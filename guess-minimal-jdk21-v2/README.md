# Juego "Guess" — Spring Boot + JDK 21 + JUnit + Git

Proyecto Maven sencillo (Spring Boot 3.3.4) con un mini servicio de "adivina el número".

## Requisitos
- JDK 21 (`java -version` debe mostrar 21).
- Maven 3.9+.
- Git (opcional para versionado).

## Ejecutar
```bash
mvn -U clean spring-boot:run
```

## Probar API
```bash
# Health
curl -i http://localhost:8080/api/guess/health

# Start (min/max opcional)
curl -s -X POST http://localhost:8080/api/guess/start -H "Content-Type: application/json" -d '{"min":1,"max":10}'

# Intenta (sustituye GAME_ID)
curl -s -X POST http://localhost:8080/api/guess/try -H "Content-Type: application/json" -d '{"gameId":"GAME_ID","number":5}'

# Estado
curl -i http://localhost:8080/api/guess/state/GAME_ID
```

## Tests
```bash
mvn -q -Dtest=GameServiceTest test
```

## Git rápido
```bash
git init
git add .
git commit -m "Proyecto Guess mínimo con Spring Boot 3.3.4, JDK21 y JUnit"
```

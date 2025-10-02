package com.proyecto_inicial.nuevo.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto_inicial.nuevo.model.Juego;
import com.proyecto_inicial.nuevo.model.Jugador;
import com.proyecto_inicial.nuevo.model.Palabra;
import com.proyecto_inicial.nuevo.utils.LectorDoc;
import com.proyecto_inicial.nuevo.utils.UtilitiesLines;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/juego")
public class JuegoController {
    
    @GetMapping("/contar-palabras")
    public Map<String,Integer> cantidadPalabras(){
        int valor = LectorDoc.contadoLineas();
        return Collections.singletonMap("numero", valor);
    }

    @PostMapping("/nuevo-juego")
    public Map <String, Object> nuevoJuego(HttpSession session){

        Jugador jugador = new Jugador ("jugador");
        String palabraRandom = UtilitiesLines.escogerPalabra();
        Palabra palabra = new Palabra(palabraRandom);
        Juego juego = new Juego(jugador, palabra);

        session.setAttribute("juego", juego);
        return estadoJuego(juego);
    }

    @PostMapping("/intentar")
    public Map<String, Object> intentar(@RequestParam String intento, HttpSession session) {
        Juego juego = (Juego) session.getAttribute("juego");
        if (juego != null && !juego.juegoTerminado()) {
            juego.intentarLetraOPalabra(intento);
        }
        return estadoJuego(juego);
    }

    @GetMapping("/estado")
    public Map<String, Object> estado(HttpSession session) {
        Juego juego = (Juego) session.getAttribute("juego");
        return estadoJuego(juego);
    }


    private Map<String, Object> estadoJuego (Juego juego){
        Map<String, Object> respuesta = new HashMap<>();
        if(juego == null){
            respuesta.put("mensaje", "No hay juego en curso");
            return respuesta;
        }

        respuesta.put("intentos", juego.getJugador().getIntentos());
        respuesta.put("letrasAcertadas", juego.getPalabra().getLetrasAcertadas());
        respuesta.put("letrasUsadas", juego.getPalabra().getLetrasElegidas());
        respuesta.put("terminado", juego.juegoTerminado());
        respuesta.put("palabra", juego.getPalabra().getPalabraMostrada());
        return respuesta;
    }

}

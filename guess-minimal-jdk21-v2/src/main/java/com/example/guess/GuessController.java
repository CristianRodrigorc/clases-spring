package com.example.guess;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/guess")
public class GuessController {
    private final GameService service;

    public GuessController(GameService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("OK");
    }

    // --- START ---
    @PostMapping("/start")
    public ResponseEntity<Dtos.StartResponse> start(@RequestBody(required = false) Dtos.StartRequest req) {
        int min = (req != null && req.min() != null) ? req.min() : 1;
        int max = (req != null && req.max() != null) ? req.max() : 100;
        GameState state = service.startGame(min, max);
        return ResponseEntity.ok(new Dtos.StartResponse(state.getId(), min, max));
    }

    // GET-friendly alternative for browser testing: /api/guess/start?min=1&max=100
    @GetMapping("/start")
    public ResponseEntity<Dtos.StartResponse> startGet(
            @RequestParam(name = "min", required = false, defaultValue = "1") int min,
            @RequestParam(name = "max", required = false, defaultValue = "100") int max) {
        GameState state = service.startGame(min, max);
        return ResponseEntity.ok(new Dtos.StartResponse(state.getId(), min, max));
    }

    // --- TRY ---
    @PostMapping("/try")
    public ResponseEntity<Dtos.TryResponse> tryNumber(@RequestBody Dtos.TryRequest req) {
        GameService.Result r = service.tryNumber(req.gameId(), req.number());
        return ResponseEntity.ok(new Dtos.TryResponse(r.status(), r.tries()));
    }

    // GET-friendly alternative: /api/guess/try?gameId=...&number=42
    @GetMapping("/try")
    public ResponseEntity<Dtos.TryResponse> tryNumberGet(
            @RequestParam("gameId") UUID gameId,
            @RequestParam("number") int number) {
        GameService.Result r = service.tryNumber(gameId, number);
        return ResponseEntity.ok(new Dtos.TryResponse(r.status(), r.tries()));
    }

    // --- STATE ---
    @GetMapping("/state/{id}")
    public ResponseEntity<Dtos.StateResponse> state(@PathVariable("id") UUID id) {
        GameState s = service.get(id);
        return ResponseEntity.ok(new Dtos.StateResponse(s.getId(), s.isFinished(), s.getTries()));
    }
}

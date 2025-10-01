package com.example.guess;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class GameService {
    private final SecureRandom random = new SecureRandom();
    private final Map<UUID, GameState> games = new ConcurrentHashMap<>();

    public GameState startGame(int min, int max) {
        if (min >= max) throw new IllegalArgumentException("min < max requerido");
        int target = random.nextInt((max - min) + 1) + min;
        UUID id = UUID.randomUUID();
        GameState state = new GameState(id, target);
        games.put(id, state);
        return state;
    }

    public Result tryNumber(UUID id, int guess) {
        GameState state = games.get(id);
        if (state == null) throw new IllegalArgumentException("Juego no encontrado");
        if (state.isFinished()) return new Result("finished", state.getTries());
        state.incrementTries();
        if (guess == state.getTarget()) {
            state.finish();
            return new Result("correct", state.getTries());
        }
        return new Result(guess < state.getTarget() ? "higher" : "lower", state.getTries());
    }

    public GameState get(UUID id) {
        GameState state = games.get(id);
        if (state == null) throw new IllegalArgumentException("Juego no encontrado");
        return state;
    }

    public record Result(String status, int tries) {}
}

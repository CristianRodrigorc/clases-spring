package com.example.guess;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameServiceTest {

    @Test
    void fullFlow() {
        GameService service = new GameService();
        GameState s = service.startGame(1, 1); // always target 1
        assertNotNull(s.getId());
        var result1 = service.tryNumber(s.getId(), 2);
        assertEquals("lower", result1.status());
        var result2 = service.tryNumber(s.getId(), 1);
        assertEquals("correct", result2.status());
        assertTrue(service.get(s.getId()).isFinished());
    }
}

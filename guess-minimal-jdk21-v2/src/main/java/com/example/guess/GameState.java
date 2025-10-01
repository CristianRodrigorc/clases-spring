package com.example.guess;

import java.util.UUID;

public class GameState {
    private final UUID id;
    private final int target;
    private int tries;
    private boolean finished;

    public GameState(UUID id, int target) {
        this.id = id;
        this.target = target;
        this.tries = 0;
        this.finished = false;
    }

    public UUID getId() { return id; }
    public int getTarget() { return target; }
    public int getTries() { return tries; }
    public boolean isFinished() { return finished; }
    public void incrementTries() { this.tries++; }
    public void finish() { this.finished = true; }
}

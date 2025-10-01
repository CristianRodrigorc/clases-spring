package com.example.guess;

import jakarta.validation.constraints.*;
import java.util.UUID;

import org.springframework.validation.annotation.Validated;

public class Dtos {
    @Validated
    public record StartRequest(@NotNull @Min(1) Integer min,@NotNull @Min(1) Integer max) {}
    public record StartResponse(UUID gameId, int min, int max) {}
    @Validated
    public record TryRequest(@NotNull UUID gameId, @Min(1) int number) {}
    public record TryResponse(String status, int tries) {}
    public record StateResponse(UUID gameId, boolean finished, int tries) {}
}

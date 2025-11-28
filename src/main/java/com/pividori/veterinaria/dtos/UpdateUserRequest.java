package com.pividori.veterinaria.dtos;

import java.time.LocalDate;

public record UpdateUserRequest(
        String name,
        String lastname,
        String email,
        LocalDate dob
) {
}

package com.pividori.Veterinaria.dto;

import java.time.LocalDate;

public record RegisterRequest(

        String name,
        String lastname,
        String username,
        String email,
        String password,
        LocalDate dob

) {
}

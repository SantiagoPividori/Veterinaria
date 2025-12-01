package com.pividori.veterinaria.dtos;

import java.time.LocalDate;

//ToDo: #Ver si puedo reemplazar este record con CreateUserRequest o viceversa.

public record RegisterRequest(
        String name,
        String lastname,
        String username,
        String email,
        String password,
        LocalDate dob

) {
}

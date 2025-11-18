package com.pividori.Veterinaria.dto;

import com.pividori.Veterinaria.model.Role;

import java.time.LocalDate;
import java.util.Set;

public record CreateUserRequest(
        String name,
        String lastname,
        String email,
        String password,
        LocalDate dob,
        Set<Role> roles
) {
}

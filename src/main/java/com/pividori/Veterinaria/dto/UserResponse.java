package com.pividori.Veterinaria.dto;

import com.pividori.Veterinaria.model.Role;

import java.time.LocalDate;
import java.util.Set;

public record UserResponse(
        Long id,
        String name,
        String lastname,
        String email,
        LocalDate dob,
        Set<Role> roles
) {
}

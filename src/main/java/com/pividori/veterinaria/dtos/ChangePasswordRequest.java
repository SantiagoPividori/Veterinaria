package com.pividori.veterinaria.dtos;

public record ChangePasswordRequest(
        String currentPassword,
        String newPassword
) {
}

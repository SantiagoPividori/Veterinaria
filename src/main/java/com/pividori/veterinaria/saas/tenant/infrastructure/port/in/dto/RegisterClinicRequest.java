package com.pividori.veterinaria.saas.tenant.infrastructure.port.in.dto;

import jakarta.validation.constraints.NotBlank;

public record RegisterClinicRequest (
        @NotBlank String name,
        @NotBlank String timeZone
){
}

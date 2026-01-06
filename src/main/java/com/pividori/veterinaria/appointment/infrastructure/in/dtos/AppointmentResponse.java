package com.pividori.veterinaria.appointment.infrastructure.in.dtos;

import java.time.LocalDate;

public record AppointmentResponse(
        Long vetId,
        Long petId,
        LocalDate startAt,
        String reason
) {
}

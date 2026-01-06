package com.pividori.veterinaria.clinics.appointment.infrastructure.in.dtos;

import java.time.LocalDate;

public record AppointmentResponse(
        Long vetId,
        Long petId,
        LocalDate startAt,
        String reason
) {
}

package com.pividori.veterinaria.saas.tenant.application.port.in;

public record RegisterClinicCommand(
        String name,
        String timeZone
) {
}

package com.pividori.veterinaria.saas.tenant.application.port.in;

import com.pividori.veterinaria.saas.tenant.domain.ClinicId;

public record RegisterClinicResult(
        ClinicId clinicId
) {
}

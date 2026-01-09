package com.pividori.veterinaria.saas.tenant.application.port.out;

import com.pividori.veterinaria.saas.tenant.domain.model.Clinic;

public interface ClinicRepositoryPort {

    Clinic save(Clinic clinic);
}

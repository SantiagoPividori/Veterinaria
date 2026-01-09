package com.pividori.veterinaria.saas.tenant.infrastructure.persistence.mapper;

import com.pividori.veterinaria.saas.tenant.domain.model.Clinic;
import com.pividori.veterinaria.saas.tenant.domain.ClinicId;
import com.pividori.veterinaria.saas.tenant.infrastructure.persistence.ClinicEntity;

public final class ClinicPersistenceMapper {

    private ClinicPersistenceMapper() {
    }

    public static Clinic fromClinicEntity(ClinicEntity clinicEntity) {
        ClinicId clinicId = new ClinicId(clinicEntity.getId());
        return new Clinic(clinicId,
                clinicEntity.getName(),
                clinicEntity.getStatus(),
                clinicEntity.getCreatedAt());
    }

    public static ClinicEntity toClinicEntity(Clinic clinic) {
        return ClinicEntity.builder()
                .id(clinic.getId() == null ? null : clinic.getId().value())
                .name(clinic.getName())
                .status(clinic.getStatus())
                .createdAt(clinic.getCreatedAt())
                .build();
    }

}
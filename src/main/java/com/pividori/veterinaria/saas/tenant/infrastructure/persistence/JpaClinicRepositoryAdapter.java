package com.pividori.veterinaria.saas.tenant.infrastructure.persistence;

import com.pividori.veterinaria.saas.tenant.application.port.out.ClinicRepositoryPort;
import com.pividori.veterinaria.saas.tenant.domain.model.Clinic;
import com.pividori.veterinaria.saas.tenant.infrastructure.persistence.mapper.ClinicPersistenceMapper;
import com.pividori.veterinaria.saas.tenant.infrastructure.port.out.SpringDataClinicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaClinicRepositoryAdapter implements ClinicRepositoryPort {

    private final SpringDataClinicRepository springDataClinicRepository;

    @Override
    public Clinic save(Clinic clinic) {
        ClinicEntity clinicEntity = ClinicPersistenceMapper.toClinicEntity(clinic);
        return ClinicPersistenceMapper.fromClinicEntity(springDataClinicRepository.save(clinicEntity));
    }

}

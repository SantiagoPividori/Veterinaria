package com.pividori.veterinaria.saas.tenant.infrastructure.port.out;

import com.pividori.veterinaria.saas.tenant.infrastructure.persistence.ClinicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataClinicRepository extends JpaRepository<ClinicEntity, Long> {
}

package com.pividori.veterinaria.clinics.clinichistory.infraestructure.out;

import com.pividori.veterinaria.clinics.clinichistory.domain.ClinicHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicHistoryRepository extends JpaRepository<ClinicHistory, Long> {
}
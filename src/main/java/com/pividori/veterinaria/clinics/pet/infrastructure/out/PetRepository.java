package com.pividori.veterinaria.clinics.pet.infrastructure.out;

import com.pividori.veterinaria.clinics.pet.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}

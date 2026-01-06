package com.pividori.veterinaria.pet.infrastructure.out;

import com.pividori.veterinaria.pet.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}

package com.pividori.Veterinaria.repository;

import com.pividori.Veterinaria.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPetRepository extends JpaRepository<Pet, Long> {
}

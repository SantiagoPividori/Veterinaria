package com.pividori.Veterinaria.repository;

import com.pividori.Veterinaria.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}

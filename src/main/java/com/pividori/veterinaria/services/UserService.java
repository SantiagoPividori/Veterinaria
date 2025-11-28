package com.pividori.veterinaria.services;

import com.pividori.veterinaria.dtos.CreateUserRequest;
import com.pividori.veterinaria.dtos.LoginRequest;
import com.pividori.veterinaria.dtos.UpdateUserRequest;
import com.pividori.veterinaria.dtos.UserResponse;
import com.pividori.veterinaria.models.User;

import java.util.List;

public interface UserService {

    UserResponse findByUsername(String username);

    UserResponse findByEmail(String email);

    void deleteById(Long id);

    UserResponse update(Long id, UpdateUserRequest updateUserRequest);

    UserResponse register(CreateUserRequest createdUserRequest);

}

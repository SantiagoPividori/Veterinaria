package com.pividori.veterinaria.services;

import com.pividori.veterinaria.dtos.*;
import com.pividori.veterinaria.models.User;

import java.util.List;

public interface UserService {

    UserResponse findByUsername(String username);

    UserResponse findByEmail(String email);

    void deleteById(Long id);

    UserResponse update(Long id, UpdateUserRequest updateUserRequest);

    UserResponse changePassword(Long id, ChangePasswordRequest changePasswordRequest);

    UserResponse register(CreateUserRequest createdUserRequest);

}

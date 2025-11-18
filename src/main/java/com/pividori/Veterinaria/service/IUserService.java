package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.dto.CreateUserRequest;
import com.pividori.Veterinaria.dto.UserResponse;
import com.pividori.Veterinaria.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    public User findUserByUsername(String username);

    public UserResponse createUser(CreateUserRequest createdUserRequest);

    public UserResponse getUserById(Long id);

    public void deletedUserById(Long id);

//    public UserResponse editUser(CreateUserRequest createUserRequest);

    public List<UserResponse> getAllUsers();
}

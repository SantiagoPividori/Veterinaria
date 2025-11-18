package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.dto.CreateUserRequest;
import com.pividori.Veterinaria.dto.UserResponse;
import com.pividori.Veterinaria.exception.UserNotFoundException;
import com.pividori.Veterinaria.model.User;
import com.pividori.Veterinaria.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService implements IUserService {

    private final IUserRepository userRepository;

    @Override
    public User findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public UserResponse createUser(CreateUserRequest createdUserRequest) {
        User savedUser = userRepository.save(new User(
                createdUserRequest.name(),
                createdUserRequest.lastname(),
                createdUserRequest.email(),
                createdUserRequest.password(), //WARNING!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                createdUserRequest.dob(),
                createdUserRequest.roles()
        ));

        log.info("Saving new user to the database");

        return new UserResponse(
                savedUser.getId(), savedUser.getName(), savedUser.getLastname(), savedUser.getEmail(), savedUser.getDob(), savedUser.getRoles()
        );
    }

    @Override
    public UserResponse getUserById(Long id) {

        User foundUser = userRepository.findById(id).orElseThrow(() -> {
            log.error("Error searching user with id: {}", id);
            return new UserNotFoundException(id);
        });

        log.info("Found user {}", foundUser.getName());

        return new UserResponse(
                foundUser.getId(),
                foundUser.getName(),
                foundUser.getLastname(),
                foundUser.getEmail(),
                foundUser.getDob(),
                foundUser.getRoles()
        );
    }

    @Override
    public void deletedUserById(Long id) {
        userRepository.delete(userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id)));
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserResponse(user.getId(), user.getName(), user.getLastname(), user.getEmail(), user.getDob(), user.getRoles()))
                .toList();
    }
}

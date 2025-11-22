package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.dto.LoginRequest;
import com.pividori.Veterinaria.dto.RegisterRequest;
import com.pividori.Veterinaria.dto.TokenResponse;
import com.pividori.Veterinaria.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final IUserRepository userRepository;

    public TokenResponse register(RegisterRequest registerRequest) {
        if(userRepository.findUserByUsername(registerRequest.username()) !=)
    }

    public TokenResponse login(LoginRequest loginRequest) {
    }

    public TokenResponse refreshToken(String authHeader) {
    }
}

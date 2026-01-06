package com.pividori.veterinaria.shared.exceptions;

public class UsernameAlreadyTakenException extends RuntimeException {
    public UsernameAlreadyTakenException(String username) {
        super("Username: " + username + " is already taken");
    }
}

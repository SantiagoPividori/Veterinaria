package com.pividori.veterinaria.shared.exceptions;

public class PasswordIncorrectException extends RuntimeException {
    public PasswordIncorrectException(String username) {
        super("Password incorrect for user: " + username);
    }
}

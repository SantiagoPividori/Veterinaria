package com.pividori.veterinaria.shared.exceptions;

public class EmailAlreadyTakenException extends RuntimeException {
    public EmailAlreadyTakenException(String email) {
        super("Email: " + email + " is already taken: ");
    }
}

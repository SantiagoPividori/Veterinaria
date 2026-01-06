package com.pividori.veterinaria.shared.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String field, String value) {
        super("User not found by " + field + ": " + value);
    }

}

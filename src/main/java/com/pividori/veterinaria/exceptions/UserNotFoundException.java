package com.pividori.veterinaria.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String field, String value) {
        super("User not found by " + field + ": " + value);
    }

}

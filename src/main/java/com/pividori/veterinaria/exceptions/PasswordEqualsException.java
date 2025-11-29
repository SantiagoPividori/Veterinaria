package com.pividori.veterinaria.exceptions;

public class PasswordEqualsException extends RuntimeException {
    public PasswordEqualsException() {
        super("Password is equals");
    }
}

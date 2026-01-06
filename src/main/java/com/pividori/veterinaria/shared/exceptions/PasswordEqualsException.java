package com.pividori.veterinaria.shared.exceptions;

public class PasswordEqualsException extends RuntimeException {
    public PasswordEqualsException() {
        super("Password is equals");
    }
}

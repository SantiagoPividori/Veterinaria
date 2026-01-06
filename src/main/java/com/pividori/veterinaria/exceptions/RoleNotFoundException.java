package com.pividori.veterinaria.exceptions;

import com.pividori.veterinaria.user.domain.RoleEnum;

public class RoleNotFoundException extends RuntimeException {

    public RoleNotFoundException(RoleEnum roleEnum) {
        super("Role not found: " + roleEnum);
    }
}

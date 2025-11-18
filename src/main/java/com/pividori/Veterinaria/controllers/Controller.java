package com.pividori.Veterinaria.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class Controller {

    @GetMapping("/hola")
    @PreAuthorize("permitAll()")
    public String hola(){
        return "Hola";
    }

    @GetMapping("/holaPremium")
    @PreAuthorize("hasAuthority('READ')")
    public String holaPremium(){
        return "HOLA CAMPEÓN!";
    }

}

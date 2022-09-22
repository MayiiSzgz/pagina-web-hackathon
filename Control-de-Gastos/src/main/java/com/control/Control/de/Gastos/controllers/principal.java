package com.control.Control.de.Gastos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class principal {

    @GetMapping("/")
    public String index() {
        return "Hola Mundo";
    }
}

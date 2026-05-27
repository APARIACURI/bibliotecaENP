package com.utp.bibliotecaENP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BibliotecaController {

    @GetMapping("/")
    @ResponseBody
    public String inicio() {
        return "Servidor funcionando";
    }

}
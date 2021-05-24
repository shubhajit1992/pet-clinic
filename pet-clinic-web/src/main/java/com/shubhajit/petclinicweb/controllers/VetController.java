package com.shubhajit.petclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    @GetMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String vetsList() {
        return "vets/index";
    }
}


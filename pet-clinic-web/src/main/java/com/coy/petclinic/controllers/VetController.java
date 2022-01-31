package com.coy.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/vets")
public class VetController {

    @RequestMapping(path = {"index", "index.html", ""})
    public String listVets() {
        return "vets/index";
    }
}

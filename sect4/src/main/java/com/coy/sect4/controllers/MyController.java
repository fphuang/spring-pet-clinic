package com.coy.sect4.controllers;

import com.coy.sect4.services.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value="myController")
//@RequestMapping("/")
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

//  @GetMapping(path="")
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

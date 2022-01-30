package com.coy.sect4.controllers;

import com.coy.sect4.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("i18nController")
public class I18NController {
    private final GreetingService greetingService;

    public I18NController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return  greetingService.sayGreeting();
    }
}

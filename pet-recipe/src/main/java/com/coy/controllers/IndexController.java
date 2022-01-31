package com.coy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(path={"", "index"})
    public String getIndexPage() {
        System.out.println("hello");
        return "index";
    }
}

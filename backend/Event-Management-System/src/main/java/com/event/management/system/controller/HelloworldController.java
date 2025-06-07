package com.event.management.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1")
public class HelloworldController {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "HEllo world";
    }
}

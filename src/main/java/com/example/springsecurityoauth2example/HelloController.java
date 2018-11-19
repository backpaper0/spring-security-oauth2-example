package com.example.springsecurityoauth2example;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hello(final Authentication a) {
        return String.format("Hello, %s!", a.getName());
    }
}

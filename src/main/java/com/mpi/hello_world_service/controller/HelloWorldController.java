package com.mpi.hello_world_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1") // Define um prefixo para todos os endpoints desta classe
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, world with Spring Boot!";
    }
}
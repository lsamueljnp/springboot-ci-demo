package com.example.hello_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + " from Spring Boot on macOS M4!!";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from Spring Boot on macOS M4!!";
    }
}
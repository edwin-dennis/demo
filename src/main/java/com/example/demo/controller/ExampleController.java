package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/hi")
    public String sayHi() {
        return "hola mundo";
    }

    @GetMapping("/surendra")
    public String yourName() {
        return "my name is Surendra";
    }

}

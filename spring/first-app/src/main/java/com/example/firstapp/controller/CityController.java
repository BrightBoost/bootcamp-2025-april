package com.example.firstapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {


    // get endpoint - url/hi
    @GetMapping("hi")
    public String quickExample() {
        return "Helllloooo!!!!";
    }

    @GetMapping("hi/{name}")
    public String quickPersonalizedExample(@PathVariable String name) {
        return "Hii " + name;
    }
}

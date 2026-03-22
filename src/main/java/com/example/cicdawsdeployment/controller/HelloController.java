package com.example.cicdawsdeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloMethod(){
        return "Hello this is CI CD Pipeline...>";
    }
}

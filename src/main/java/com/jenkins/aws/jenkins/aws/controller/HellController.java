package com.jenkins.aws.jenkins.aws.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellController {

    @GetMapping("/")
    public String reHello(){
        return "hello man";
    }
}

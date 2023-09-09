package com.devcoast.mobilityloadbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getHomeMessage() {
        return "Welcome to Mobility Load App";
    }
}

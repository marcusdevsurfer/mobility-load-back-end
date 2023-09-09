package com.devcoast.mobilityloadbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitController {

    @GetMapping("/")
    public String firstController(){
        return "Working...";
    }
}

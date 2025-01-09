package com.jeevan.database.migration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/flyway")
public class FlyWayController {

    @GetMapping(value = "/fly")
    public String flyway(){
        return "Hello flyway Controller.....!";
    }
}

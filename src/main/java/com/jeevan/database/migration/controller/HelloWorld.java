package com.jeevan.database.migration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private final FlyWayController flyWayController;

    @Autowired
    public HelloWorld(FlyWayController flyWayController) {
        System.out.println("This is related to new branch code.....!");
        this.flyWayController = flyWayController;
    }
}

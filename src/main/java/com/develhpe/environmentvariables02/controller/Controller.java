package com.develhpe.environmentvariables02.controller;

import com.develhpe.environmentvariables02.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @GetMapping(path = "/hello")
    public String hello() {
        return service.welcomeMessage();
    }
}

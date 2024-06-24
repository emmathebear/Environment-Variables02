package com.develhpe.environmentvariables02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Environment environment;

    public String welcomeMessage() {

        return environment.getProperty("customVar.welcomeMsg");
    }
}

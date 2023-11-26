package com.example.spring6dependencyinjection.controllers;

import com.example.spring6dependencyinjection.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You are in the " + environmentService.getEnv() + " Environment";
    }
}

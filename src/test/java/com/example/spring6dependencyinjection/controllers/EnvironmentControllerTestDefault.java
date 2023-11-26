package com.example.spring6dependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
class EnvironmentControllerTestDefault {

    @Autowired
    EnvironmentController controller;
    @Test
    void getEnvironment() {
        System.out.println(controller.getEnvironment());
    }
}
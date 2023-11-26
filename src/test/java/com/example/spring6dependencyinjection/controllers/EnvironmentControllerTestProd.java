package com.example.spring6dependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class EnvironmentControllerTestProd {

    @Autowired
    EnvironmentController controller;
    @Test
    void getEnvironment() {
        System.out.println(controller.getEnvironment());
    }
}
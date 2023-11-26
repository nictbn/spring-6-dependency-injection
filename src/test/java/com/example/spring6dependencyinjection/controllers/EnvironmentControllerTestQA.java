package com.example.spring6dependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"qa", "EN"})
@SpringBootTest
class EnvironmentControllerTestQA {

    @Autowired
    EnvironmentController controller;
    @Test
    void getEnvironment() {
        System.out.println(controller.getEnvironment());
    }
}
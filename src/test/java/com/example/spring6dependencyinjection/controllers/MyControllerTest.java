package com.example.spring6dependencyinjection.controllers;

import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}
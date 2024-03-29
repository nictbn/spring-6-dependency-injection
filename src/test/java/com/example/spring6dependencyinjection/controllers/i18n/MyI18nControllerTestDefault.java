package com.example.spring6dependencyinjection.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
public class MyI18nControllerTestDefault {

    @Autowired
    MyI18nController myI18nController;

    @Test
    void sayHello() {
        System.out.println(myI18nController.sayHello());

    }
}

package com.example.spring6dependencyinjection;

import com.example.spring6dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6DependencyInjectionApplication.class, args);
		System.out.println("In main method");
		MyController controller = ctx.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

}

package com.techxaidz.todospringgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class TodoSpringGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoSpringGradleApplication.class, args);
	}

}

package com.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
@SpringBootApplication
@ComponentScan(basePackageClasses = DemoApplication.class )
public class DemoApplication {

	@GetMapping(value = "/hello")
	public String get()
	{
		return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

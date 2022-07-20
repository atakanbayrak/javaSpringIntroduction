package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		//context.refresh();
		
		ICustomerService customerService= context.getBean("service",ICustomerService.class);
		
		customerService.add();
	}
	
	//IoC - Inversion of Control <--- Birbirinin alternatifi olan i�leri ayr� classlarda y�netiyoruz.
	//Dependency Injection <--- Design Pattern
	//SOLID 
}

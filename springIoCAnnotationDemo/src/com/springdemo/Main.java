package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		//context.refresh();
		
		ICustomerService customerService= context.getBean("service",ICustomerService.class);
		
		customerService.add();
	}
	
	//IoC - Inversion of Control <--- Birbirinin alternatifi olan iþleri ayrý classlarda yönetiyoruz.
	//Dependency Injection <--- Design Pattern
	//SOLID 
}

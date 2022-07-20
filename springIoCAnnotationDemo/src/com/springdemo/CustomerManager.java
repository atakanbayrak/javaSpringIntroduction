package com.springdemo;

public class CustomerManager implements ICustomerService{
	
	
	private ICustomerDal customerDal;
	
	//Constructor Injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	public void add() {
		//Is kurallari
		customerDal.add();
		
	}

}


	//Setter Injection
	/*public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}*/
package com.PerScholas.srpingcoreproject_02_models;

import org.springframework.beans.factory.annotation.Autowired;

import com.PerScholas.srpingcoreproject_02_geeting_interface.GreetingService;

public class Person {
	@Autowired
private GreetingService greetingService;

	
//	public Person(GreetingService greetingService) {
//			this.greetingService = greetingService;
//	}

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
}

package com.PerScholas.srpingcoreproject_02_models;

import com.PerScholas.srpingcoreproject_02_geeting_interface.GreetingService;

public class Person {
private GreetingService greetingService;

	public Person(GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
}

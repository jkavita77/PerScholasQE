package com.PerScholas.srpingcoreproject_02_geeting_interface.impl;

import com.PerScholas.srpingcoreproject_02_geeting_interface.GreetingService;

public class EnglishGreeting implements GreetingService {

	@Override
	public String sayHello() {
		
		return "Hello PerScholas!";
	}

	@Override
	public String sayWelcome() {
		// TODO Auto-generated method stub
		return "Welcome everyone!";
	}

}

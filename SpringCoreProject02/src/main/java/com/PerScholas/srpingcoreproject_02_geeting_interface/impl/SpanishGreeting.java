package com.PerScholas.srpingcoreproject_02_geeting_interface.impl;

import com.PerScholas.srpingcoreproject_02_geeting_interface.GreetingService;

public class SpanishGreeting implements GreetingService {

	@Override
	public String sayHello() {
		
		return "Hola Per Scholas!";
	}

	@Override
	public String sayWelcome() {
		return "Bienvenidos a todos";
	}

}

package com.PerScholas.srpingcoreproject_02_geeting_interface.impl;

import com.PerScholas.srpingcoreproject_02_geeting_interface.GreetingService;

public class TexasGreeting implements GreetingService {

	@Override
	public String sayHello() {
	return "Howdy y'all!";
	}

	@Override
	public String sayWelcome() {
	return "y'all com on in";
	}

}

package com.PerScholas.srpingcoreproject_02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.PerScholas.srpingcoreproject_02_geeting_interface.impl.EnglishGreeting;
import com.PerScholas.srpingcoreproject_02_models.Person;

@Configuration
public class GreetingConfig {
@Bean("person")
public Person person() {
	return new Person();
}

@Bean("english")
public EnglishGreeting englishGreeting() {
	return new EnglishGreeting();
}
}

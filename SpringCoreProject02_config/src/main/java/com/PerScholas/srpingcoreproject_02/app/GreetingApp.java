package com.PerScholas.srpingcoreproject_02.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PerScholas.srpingcoreproject_02.config.GreetingConfig;
import com.PerScholas.srpingcoreproject_02_models.Person;

public class GreetingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(GreetingConfig.class);

		Person p = context.getBean("person", Person.class);
		System.out.println(p.getGreetingService().sayHello());
	context.close();	
	}

}

package com.PerScholas_SpringCore_app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PerScholas_SpringCore_models.SpringGreeting;

public class SpringGreetingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  AbstractApplicationContext context = 
	   new ClassPathXmlApplicationContext("/com/PerScholas_SpringCore_exc1/BeanDef.xml");
		
 SpringGreeting sg = context.getBean("SpringGreeting", 
				SpringGreeting.class);
 System.out.println(sg.sayHello());
 
 context.close();
 
		
	}

}

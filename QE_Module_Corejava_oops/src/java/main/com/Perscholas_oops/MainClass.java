package com.Perscholas_oops;

import com.Perscholas_oops_Models.Student;

public class MainClass {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2 = new Student("John", "John@com");
		System.out.println(s1.getName());
		System.out.println(s2.getEmail());
		
	/*	
		Classone Classone = new Classone();
		Classone ClassoneA = new Classone();
		Classone.helloFromclassone();
		ClassoneA.helloFromclassone();
		System.out.println(Classone.returHelloFromClassone());*/
		
		
	//	System.out.println("say Hello from main method");
		MainClass mc = new MainClass();
		mc.sayHello();
		//mc.returnHello();
		System.out.println(mc.returnHello());
	}
//method is made that is called
	public void sayHello() {
		System.out.println("Hello  QE2019");
}
	//method made to be called in the systemout print
	public String returnHello() {
		return" hello";
	}
}



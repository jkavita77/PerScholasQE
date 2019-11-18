package com.Perscholas;

public class ObjIntro {

	public static void main(String[] args) {
		Person.Eat("Hungry");
	  Person qeeng = new Person();
	  qeeng.age = 90;
	  qeeng.setAge(80);
	  System.out.println(qeeng.age);
	}
   
	public static class Person {
		//Attribute(Fields)
		private String  name;
		private int age;
		private String gender;
		private Double height;
		private Double weight;
		
		//Methods
		public  static void Eat(String s) 
		{
		if (s.equals("Hungry"))
			System.out.println(" Need food");
		else 
			System.out.println("Let finish my work");
		}
		
		public  void Sleep(String s) 
		{
		if (s.equals("Sleepy"))
			System.out.println(" Time  to sleep");
		else 
			System.out.println("Work on Java ");
		}

		
		//getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Double getHeight() {
			return height;
		}

		public void setHeight(Double height) {
			this.height = height;
		}

		public Double getWeight() {
			return weight;
		}

		public void setWeight(Double weight) {
			this.weight = weight;
		}
		
		
}
	}
package com.qacommunity.qa;

public class Person {
	private String name; 
	private int age;
	private String job; 
	private int height;
	
	
	
	public Person(String name, int age, String job, int height) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.height = height;
	}


	public Person(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	
	public void greetMethod() {
		System.out.println("Hello, my name is "+name);
		System.out.println("I am "+age+" years old,  my job is "+job+" and my height is "+height+" cm.");
		System.out.println("\n");
	}
	
	public void greetMethod2() {
		System.out.println("Hi, my name is "+name+" and I am "+height+" cm tall.");
		System.out.println("\n");
	}
	
	public static void testMethod() {
		System.out.println("This is a static test method within the Person class");
	}
	
	
	

}

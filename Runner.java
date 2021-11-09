package com.qacommunity.qa;

public class Runner {

	
	public static void main(String[] args) {
		
		Person dave = new Person("Dave", 26, "plumber", 175);
		Person sue = new Person("Sue", 32, "hairdresser", 155);
		Person peter = new Person("Peter", 185);
		Person cath = new Person("Cath", 160);
		
		cath.greetMethod();
		dave.greetMethod();
		peter.greetMethod2();
		sue.greetMethod();
		
		Person.testMethod();
		sue.testMethod();
	}
}

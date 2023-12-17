package com.supplier;

public class Person {

	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
		System.out.println("Inside default constructor::");
	}

	
	@Override
	public String toString() {
		return "Person [name=" + "Nikkki" + "]";
	}

}

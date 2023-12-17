package com.predicate;

public class SoftwareEnginner {

	String name;
	int age;
	boolean isHavingGf;

	public SoftwareEnginner(String name, int age, boolean isHavingGf) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}

	public SoftwareEnginner() {
		super();
	}

	@Override
	public String toString() {
		return "SoftwareEnginner [name=" + name + ", age=" + age + ", isHavingGf=" + isHavingGf + "]";
	}

}

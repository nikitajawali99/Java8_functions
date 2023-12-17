package com.function;

public class SchoolStudent {

	private String name;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public SchoolStudent(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public SchoolStudent() {
		super();
	}

	@Override
	public String toString() {
		return "SchoolStudent [name=" + name + ", marks=" + marks + "]";
	}

}

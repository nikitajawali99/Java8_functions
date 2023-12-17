package com.consumer;

import java.util.function.Consumer;

public class StudentTest {

	public static void main(String[] args) {
		
		Consumer<Student> s1 = new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				if(t.getName().length()>3)
				System.out.println("Student length 3 :"+t);
			}	
		};
		
		s1.accept(new Student("Niki", 90));
		
		Consumer<Student> s2 = new Consumer<Student>() {
			
			@Override
			public void accept(Student t) {

				if(t.getMarks()>85)
				System.out.println("Student :"+t);
			}
		};
		
		s2.accept(new Student("Priya",78));
		
		System.out.println("Below andThen result :");
		s1.andThen(s2).accept(new Student("Nikita",89));
		
	}

}

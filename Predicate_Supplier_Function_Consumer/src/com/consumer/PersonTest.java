package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PersonTest {

	public static void main(String[] args) {

		getAllStudents();
		System.out.println("*** 1");
		printStudents();
		System.out.println("*** 2");
		printActivities();

		
	}

	private static void printActivities() {

		Consumer<People> s1 = People -> System.out.print(People.getName());
		Consumer<People> s2 = People -> System.out.println(People.getActivities());

		List<People> list = getAllStudents();

		list.forEach(

				s -> {

					if (s.getGender().equals("M") && s.getActivities().contains("Swimming")) {

						s1.andThen(s2).accept(s);

					}

				}
		);

	}

	private static void printStudents() {

		Consumer<People> s2 = c -> System.out.println(c);
		List<People> s3 = getAllStudents();
		s3.forEach(s2);

	}

	private static List<People> getAllStudents() {

		People p = new People("Niki", 10, 6.8, "F", List.of("Swimming", "Basket", "Volleyball"));
		People p1 = new People("Avi", 8, 7.8, "M", List.of("Basket", "Volleyball", "Swimming"));
		People p2 = new People("Ailesh", 9, 8.9, "M", List.of("Badminton", "Tennis"));

		List<People> peopleList = new ArrayList<>();
		peopleList.add(p1);
		peopleList.add(p);
		peopleList.add(p2);
		return peopleList;

	}

}

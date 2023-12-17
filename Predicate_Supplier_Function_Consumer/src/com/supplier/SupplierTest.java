package com.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		Supplier<String> supplier = () -> "Tutorial";
		System.out.println(supplier.get());

		Supplier<Integer> supplier1 = () -> 8;
		System.out.println(supplier1.get());

		Person p = new Person("Raja");
		Person p1 = get(() -> p);
		Person p2 = get(() -> p);
		System.out.println(p1.equals(p2));

		Supplier<Person> s = Person::new;
		System.out.println(s.get());

		Supplier<String> iLoveJava = () -> {
			return "Java best";
		};
		System.out.println(iLoveJava.get());

		Supplier<Person> supp = () -> {
			return new Person("Maini");

		};
		System.out.println(supp.get());

		Supplier<Double> randomNo = () -> Math.random();
		System.out.println("Random no : " + randomNo.get());

		Supplier<LocalDate> date = () -> LocalDate.now();
		System.out.println("Local date: " + date.get());

		Supplier<StringBuilder> stringdemo = () -> new StringBuilder();
		System.out.println("SB :" + stringdemo.get().append("Adidas"));

	}

	private static Person get(Supplier<Person> supplier) {
		return supplier.get();
	}

}

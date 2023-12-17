package com.function;

import java.util.function.Function;

public class Demo {

	
	public static void main(String[] args) {

		Function<String, String> f1 = s -> s.toUpperCase();

		Function<String, String> f2 = s -> s.substring(0, 4);

		System.out.println("And Then results :" + f1.andThen(f2).apply("Nikita Jawali"));

		System.out.println("Compose results :" + f1.compose(f2).apply("Nikita Jawali"));

		Function<String, String> identify = Function.identity();
		String f4 = identify.apply("Nikki");
		System.out.println("Identify result:" + f4);
	}
}

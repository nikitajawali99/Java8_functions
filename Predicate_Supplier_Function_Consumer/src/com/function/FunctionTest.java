package com.function;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		Function<String, String> s = s1 -> s1.toUpperCase();
		String apply = s.apply("Wow");
		System.out.println(apply);

		Function<String, Integer> s3 = s5 -> s5.length();
		Integer lengthResult = s3.apply("Test");
		System.out.println(lengthResult);

		Function<String, String> s5 = s9 -> s9.replace(" ", "");
		String apply2 = s5.apply("Niki Jaa ki");
		System.out.println(apply2);

		Function<String, String> andThenresult = s5.andThen(s);
		System.out.println(andThenresult.apply("Jai Mata Di"));
		
		Function<String, Integer> andThenresult2 = s5.andThen(s3);
		System.out.println(andThenresult2.apply("Jai Mata Di"));
		
	}
}

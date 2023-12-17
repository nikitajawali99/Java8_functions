package com.function;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {

		
		BiFunction<String, String, Integer> f1 = (s1, s2) -> s1.length() + s2.length();
		System.out.println("Length bi-directional:" + f1.apply("Nikita", "Nikita"));

		BiFunction<String, String, String> f2 = (s1, s2) -> s1.concat(s2);
		System.out.println("Concat result :" + f2.apply("Kri  ", " shna"));

		BiFunction<String, String, String> f3 = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
		System.out.println("Upper case result :" + f3.apply("Kri", "shna"));

		f2 = f2.andThen(s -> s.toUpperCase());
		System.out.println("AndThen trim result :" + f2.apply("Nikii  Ji", " Shahi nik"));

		BiFunction<Integer, Integer, Integer> composite2 = (a, b) -> a * b;
		composite2 = composite2.andThen(a -> 3 * a);
		System.out.println("Composite2 = " + composite2.apply(2, 3));

	}

}

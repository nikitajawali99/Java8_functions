package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {

	public static void main(String[] args) {

		/* Ex - 1 */
		Predicate<String> s = s1 -> s1.length() > 6;
		System.out.println("Is length is greater than 6:" + s.test("Test"));

		Predicate<Integer> s2 = s3 -> s3 % 2 == 0;
		System.out.println("Is number divisible by 2:" + s2.test(6));

		Predicate<String> s3 = s4 -> s4.contains("Java");
		System.out.println("Is word contains java :" + s3.test("java"));

		Predicate<List<String>> s31 = s5 -> s5.isEmpty();
		List l = new ArrayList();
		l.add("Jav");
		l.add(6);
		System.out.println("Is collection empty :" + s31.test(l));

		/* Ex - 2 */
		int[] x = { 5, 10, 20, 7, 15 };
		Predicate<Integer> p = x1 -> x1 % 5 == 0;
		Predicate<Integer> p1 = x1 -> x1 > 10;

		System.out.println("Below p resuts :");
		m1(p, x);
		System.out.println("Below p1 resuts :");
		m2(p1, x);
		System.out.println("Below AND condition results:");
		m1(p.and(p1), x);
		System.out.println("Below OR condition results:");
		m2(p.or(p1), x);
		System.out.println("Below NEGATE condition results of p1:");
		m1(p1.negate(), x);
		System.out.println("Below NEGATE condition results of p:");
		m1(p.negate(), x);

		/* Ex - 3 */
		Predicate<String> pp = p2 -> p2.length() > 5 && p2 != "";

		if(!pp.test("Test 58")) {
			System.out.println("Not Valid");
		}else {
			System.out.println("Valid");
		}
		

	}

	

	private static void m2(Predicate<Integer> p1, int[] x) {

		for (int i : x) {
			if (p1.test(i)) {
				System.out.println("Values 2:" + i);
			}
		}

	}

	private static void m1(Predicate<Integer> p, int[] x) {

		for (int i : x) {
			if (p.test(i)) {
				System.out.println("Values 1:" + i);
			}
		}

	}

}

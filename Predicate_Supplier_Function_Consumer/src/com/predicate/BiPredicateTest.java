package com.predicate;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {

		BiPredicate<Integer, String> i = (n, s) -> {

			if (n % 2 == 0 && s.length() > 0)
				return true;

			return false;

		};

		System.out.println(i.test(12, "Test"));

		BiPredicate<String, String> i2 = (n, s) -> {

			if (n.equals(s))
				return true;

			return false;

		};
		System.out.println(i2.test("Niki", "niki"));

		BiPredicate<String, String> i3 = (n, s) -> {

			if (!n.endsWith(s))
				return true;

			return false;
		};

		BiPredicate<String, String> result = i2.or(i3);
		System.out.println("Result using or:" + result.test("Niki", "Niki"));

		BiPredicate<String, String> resultAnd = i2.and(i3);
		System.out.println("Result using and:" + resultAnd.test("Niki", "Niki"));

		BiPredicate<String, String> negateRes = result.negate();
		System.out.println("Result using negate :" + negateRes.test("Nii", "Nii"));

	}

}

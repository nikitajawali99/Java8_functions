package com.consumer;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {

		/* Ex - 1 */
		BiConsumer<Integer, Integer> s = (s1, s2) -> System.out.println("Add: " + (s1 + s2));
		s.accept(20, 10);

		BiConsumer<Integer, Integer> s1 = (s3, s4) -> System.out.println("Sub: " + (s3 - s4));
		s1.accept(30, 15);
		System.out.println("And Then results :");
		s.andThen(s1).accept(50, 40);
		System.out.println();

		/* Ex - 2 */
		BiConsumer<Integer, String> biConsumer = new BiConsumer<Integer, String>() {

			@Override
			public void accept(Integer t, String u) {
				System.out.println("Number:" + t);
				System.out.println("Name:" + u);
			}
		};
		biConsumer.accept(8, "Raaz");

		BiConsumer<Integer, String> biConsumer2 = new BiConsumer<Integer, String>() {

			@Override
			public void accept(Integer t, String u) {
				System.out.println("Number:" + t);
				System.out.println("Name:" + u);
			}
		};
		
		biConsumer2.accept(5, "Java");
		System.out.println();
		System.out.println("And then results :");
		biConsumer.andThen(biConsumer2).accept(9, "C+++");

	}
}

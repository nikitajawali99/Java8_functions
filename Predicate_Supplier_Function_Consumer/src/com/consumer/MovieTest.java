package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MovieTest {

	public static void main(String[] args) {

		/* Ex - 1 */
		List<Movie> l = new ArrayList<>();

		populate(l);

		Consumer<Movie> list = c -> {

			System.out.println("Movie name:" + c.getName());
			System.out.println("Movie hero:" + c.getHero());
			System.out.println("Movie heroine:" + c.getHeroine());
			System.out.println();
		};

		for (Movie movie : l) {

			list.accept(movie);

		}

		System.out.println();

		for (Movie movie : l) {

			boolean res = movie.getHero().startsWith("R");

			if (res) {
				System.out.println("Movie starts with R name:" + movie);
			}

		}
		System.out.println();

		/* Ex - 2 (Predicate + Consumer) */
		Predicate<Movie> e = e1 -> e1.getName().length() > 7;
		for (Movie movie : l) {
			boolean test = e.test(movie);
			if (test) {
				Consumer<Movie> e2 = e3 -> System.out.println(e3.getName().toUpperCase() + "|"
						+ e3.getHero().toUpperCase() + "|" + e3.getHeroine().toUpperCase());
				e2.accept(movie);

			}
		}
	}

	private static void populate(List<Movie> l) {

		l.add(new Movie("2 States", "Rrjun", "Alia"));
		l.add(new Movie("Animal park", "Ranbir", "Rashmika"));
		l.add(new Movie("Sultan", "Salman", "Anushka"));
		
	}
}

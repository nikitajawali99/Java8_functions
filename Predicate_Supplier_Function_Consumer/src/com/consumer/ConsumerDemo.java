package com.consumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> s = s1 -> System.out.println(s1.toUpperCase());
		s.accept("Niki");
		
		Consumer<List<Integer>> list = l -> Collections.sort(l);
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(7);
		list1.add(3);
		list1.add(8);
		list.accept(list1);
		System.out.println(list1);
		
		
		
		
		
	}

}

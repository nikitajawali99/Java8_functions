package com.predicate;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		SoftwareEnginner[] list = {
				
				new SoftwareEnginner("Vijay", 20, false),
				new SoftwareEnginner("Rahul", 17, true),
				new SoftwareEnginner("Run", 27, true)				
		};
		
		Predicate<SoftwareEnginner> e = e1 -> e1.age> 18 && e1.isHavingGf==true;
		
	
		if (e.test(new SoftwareEnginner("Vijay", 20, false))) {
			System.out.println("success");
		} else
			System.out.println("failed");
		
		for (SoftwareEnginner softwareEnginner : list) {
			
			if(e.test(softwareEnginner)) {
				System.out.println(softwareEnginner);
			}
			
		}
		

	}

}

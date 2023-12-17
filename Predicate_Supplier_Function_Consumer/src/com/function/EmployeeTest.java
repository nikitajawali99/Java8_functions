package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();
		populate(l);

		Function<List<Employee>, Double> s = s1 -> {
			double totalSalary = 0.0;
			double bonus = 900;
			for (Employee employee : l) {
				System.out.println("Salary before bonus:" + employee.getSalary());
				totalSalary = bonus + employee.getSalary();
				System.out.println("Salary after bonus:" + totalSalary);
				System.out.println();
			}
			return totalSalary;

		};
		s.apply(l);

		System.out.println("***************");

		Predicate<Employee> emp = e -> e.getSalary() > 8000.0;

		Function<Employee, Employee> f1 = empSal -> {

			double e = empSal.getSalary() + 500.0;
			empSal.setSalary(e);
			return empSal;
		};

		List<Employee> l2 = new ArrayList<>();
		populate(l2);
		for (Employee employee : l2) {
			if (emp.test(employee)) {
				System.out.println("Pre-Fun conditions :");
				System.out.println(f1.apply(employee));

			}
		}
	}

	private static void populate(List<Employee> l) {

		l.add(new Employee("Niki", 90000.0));
		l.add(new Employee("Rahul", 5600.0));
		l.add(new Employee("Avi", 85000.0));

	}

}

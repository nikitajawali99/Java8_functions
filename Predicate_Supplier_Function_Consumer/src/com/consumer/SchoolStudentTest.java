package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.function.SchoolStudent;

public class SchoolStudentTest {

	public static void main(String[] args) {

		List<SchoolStudent> list = new ArrayList<>();

		populate(list);

		Function<SchoolStudent, String> f = s ->

		{
			int marks = s.getMarks();

			if (marks > 80)
				return "A";

			if (marks < 80 && marks > 65)
				return "B";

			else
				return "C";

		};

		for (SchoolStudent schoolStudent : list) {
			String apply = f.apply(schoolStudent);
			System.out.println(schoolStudent.getName() + "|" + "Grade :" + apply);
		}

	}

	private static void populate(List<SchoolStudent> list) {

		list.add(new SchoolStudent("Niki", 90));
		list.add(new SchoolStudent("Rahul", 60));
		list.add(new SchoolStudent("Avi", 75));
		list.add(new SchoolStudent("Sai", 89));

	}
}

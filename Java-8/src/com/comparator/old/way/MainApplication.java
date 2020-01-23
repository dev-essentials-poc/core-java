package com.comparator.old.way;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApplication {
 
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(27, "John", "Miller", "USA"),
				new Student(28, "John", "Wick", "UK"),
				new Student(27, "Peter", "England", "Uk"),
				new Student(37, "johney", "Walker", "USA"),
				new Student(41, "Dwen", "Johnson", "Canada")
				);
		
		System.out.println("************ Sorting students by First Name: ******************\n");
		System.out.println("Age \tFname \tLname \tAddress ");
		
		Collections.sort(students, new NameComparator());
		for(Student s : students)
			System.out.println(s);
		
		System.out.println("\n************ Sorting students by AGE: ******************\n");
		
		Collections.sort(students, new AgeComparator());
		for(Student age : students)
			System.out.println(age);
	}
	
	
}

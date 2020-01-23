package com.lambda.expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.lambda.expression.person.Person;

public class UsingLambda {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Ram", "Yewale", "Pune", 27, "M"),
				new Person("Rohit", "Sharma", "Mumbai", 35, "M"), new Person("Virat", "Kohli", "Delhi", 35, "M"),
				new Person("Virat", "Koli", "Delhi", 35, "M"), new Person("Ajinkya", "Rahane", "AhemadNagar", 40, "M"),
				new Person("Shikhar", "Dhawan", "Delhi", 43, "M")
			);
		
		// sort the list by person lastName
		System.out.println("\nSort the List based on Person Last name using Lambda Expression");
		Collections.sort(personList, (p1, p2)-> p1.getLastName().compareTo(p2.getLastName()));

		//List all the persons in list.
		System.out.println("\nSort the List of Persons using Lambda Expression");
		//personList.forEach(p -> System.out.println(p));
		printConditionally(personList, p->true);
		
		System.out.println("\nprint all the people that have first name start with V");
		printConditionally(personList, p -> p.getFirstName().startsWith("V"));
	}
	public static void printConditionally(List<Person> personList, Predicate<Person> predicate) {
		for (Person p : personList) {
			if (predicate.test(p)) {
				System.out.println(p);
			}
		}
	}

}

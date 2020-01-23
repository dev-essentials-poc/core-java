package com.lambda.expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lambda.expression.person.Person;

public class PrintAllPersonWithLambda {

	public static void main(String[] args) {
		Collections.sort(getPersons(), new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});

		System.out.println("\nprint all the persons in the list");
		printAll(getPersons());

		System.out.println("\nprint all the people that have last name start with Y");
		printConditionally(getPersons(), new Condition() {
			@Override
			public boolean testCondtion(Person p) {
				return p.getLastName().startsWith("Y");
			}
		});

		System.out.println("\nprint all the people that have first name start with R");
		printConditionally(getPersons(), new Condition() {
			@Override
			public boolean testCondtion(Person p) {
				return p.getFirstName().startsWith("R");
			}
		});
	}

	public static void printAll(List<Person> personList) {
		for (Person p : personList) {
			System.out.println(p);
		}
	}

	public static void printConditionally(List<Person> personList, Condition condition) {
		for (Person p : getPersons()) {
			if (condition.testCondtion(p)) {
				System.out.println(p);
			}
		}
	}

	public static List<Person> getPersons() {
		List<Person> personList = Arrays.asList(new Person("Ram", "Yewale", "Pune", 27, "M"),
				new Person("Rohit", "Sharma", "Mumbai", 35, "M"), new Person("Virat", "Kohli", "Delhi", 35, "M"),
				new Person("Virat", "Kale", "Delhi", 35, "M"), new Person("Ajinkya", "Rahane", "AhemadNagar", 40, "M"),
				new Person("Shikhar", "Dhawan", "Delhi", 43, "M"));
		return personList;
	}
}

package com.lambda.expression.comparator;

import java.util.Comparator;

import com.lambda.expression.person.Person;

public class ComparatorImplemetation implements Comparator<Person >{

	@Override
	public int compare(Person p1, Person p2) {
		if (p1.getAge() > p2.getAge())
			return -1;
		else if (p1.getAge() == p2.getAge())
			return 0;
		return 1;
	}
}

package com.comparable.old.way;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentDetails implements Comparable<StudentDetails> {

	int rollNo;
	int age;
	String name;

	public StudentDetails(int roll, int age, String name) {
		this.rollNo = roll;
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(StudentDetails s) {

		if (rollNo == s.rollNo)
			return 0;
		else if (rollNo > s.rollNo)
			return -1;
		return 1;
	}

}


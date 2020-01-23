package com.comparable.old.way;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MainApplication{
	
	public static void main(String[] args) {
		
		List<StudentDetails> list = Arrays.asList(new StudentDetails(2411, 25, "Ram Yewale"),
				new StudentDetails(2412, 28, "Vicky Shinde"),
				new StudentDetails(2425, 18, "Suraj Kale")
				);
		
		Collections.sort(list);
		for(StudentDetails d : list)
			System.out.println(d.age+" "+d.name+" "+d.rollNo);
	}
}

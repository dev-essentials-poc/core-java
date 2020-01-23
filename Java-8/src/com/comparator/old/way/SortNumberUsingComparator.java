package com.comparator.old.way;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumberUsingComparator {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10,0,2,-100,150,3,7,46,19,85,32);
		
		System.out.println("Unsorted list "+numberList);
		
		Collections.sort(numberList, new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {
				
				return n1.compareTo(n2);
			}
		});
		System.out.println("After sorting: "+numberList);
		
		// sorting using comparator with lambda exp.
		Collections.sort(numberList, (n1, n2) -> n1.compareTo(n2) );
		System.out.println("\nSorting using lambda exp. : \n"+numberList);

	}
		


}

package com.comparator.old.way;

public class Student {

	private int age;

	private String firstName;

	private String lastName;

	private String address;

	public Student(int age, String fName, String lName, String address) {
		this.age = age;
		this.firstName = fName;
		this.lastName = lName;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return  age + "\t" + firstName + "\t" + lastName + "\t" + address;
	}

}

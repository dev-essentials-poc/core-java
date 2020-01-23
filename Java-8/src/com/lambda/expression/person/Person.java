package com.lambda.expression.person;

public class Person {

	private String firstName;

	private String lastName;

	private String address;

	private int age;

	private String gender;

	public Person(String firstName, String lastName, String address, int age, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.gender = gender;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "firstName = " + firstName + "\t lastName = " + lastName + "\t address = " + address + "\t age = " + age
				+ "\t gender = " + gender ;
	}
}

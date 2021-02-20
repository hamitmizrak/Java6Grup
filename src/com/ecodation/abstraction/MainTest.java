package com.ecodation.abstraction;

public class MainTest {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);

		Person person = new Student(); // polymorphism
		System.out.println(person);

		person.getIdName();
		person.getConcatName(); // polymorphism
	}
}

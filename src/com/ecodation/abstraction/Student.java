package com.ecodation.abstraction;

public class Student extends Person {

	public Student() {

	}

	@Override
	public String toString() {
		return String.format("%-5s|  %-5s| %-6s", "student", getId(), getName());
	}

	@Override
	public void getConcatName() {
		this.getName().concat(" ben ekledim");

	}

}

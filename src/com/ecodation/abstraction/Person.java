package com.ecodation.abstraction;

abstract public class Person {

	// object variable
	private long id = 0;
	private String name = "ad eklenmedi";

	// normal method
	public void getIdName() {
		System.out.println(id + " " + name);
	}

	// abstract method
	abstract public void getConcatName();

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

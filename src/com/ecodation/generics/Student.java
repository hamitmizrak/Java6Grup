package com.ecodation.generics;

public class Student<T> {

	private T numberID;
	private T name;
	private T surname;
	private T age;

	// parametresiz constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public Student(T numberID, T name, T surname, T age) {
		super();
		this.numberID = numberID;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	// getter and setter
	public T getNumberID() {
		return numberID;
	}

	public void setNumberID(T numberID) {
		this.numberID = numberID;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getSurname() {
		return surname;
	}

	public void setSurname(T surname) {
		this.surname = surname;
	}

	public T getAge() {
		return age;
	}

	public void setAge(T age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [numberID=" + numberID + ", name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

}

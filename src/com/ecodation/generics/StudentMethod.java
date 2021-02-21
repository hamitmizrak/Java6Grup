package com.ecodation.generics;

public class StudentMethod {

	private String nameSurname;

	public <T> String denemeMethod(T x, T y, T z, String name, long id) {

		return this.nameSurname;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
}

package com.ecodation.oop;

public class MainTest {

	public static void main(String[] args) {
		StudentPojo student = new StudentPojo();
		System.out.println(student);

		System.out.println("--------");

		StudentBean studentBean = new StudentBean();
		studentBean.setAdi("Hamit");
		System.out.println(studentBean);

	}

}

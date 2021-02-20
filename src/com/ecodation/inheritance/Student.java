package com.ecodation.inheritance;

import java.io.IOException;

public class Student extends PersonCommonClass {

	public static void main(String[] args) throws IOException, ArithmeticException, ArrayIndexOutOfBoundsException {

		try {
			// kodlar
			int x = 4 / 0;
			System.out.println(x);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new ArithmeticException("Sıfıra bölemezsin");
		} finally {
			System.out.println("Ne olursa olsun burası çalışacak");
			System.out.println("connection.close()");

		}

		System.out.println("Merhabalar");
	}

}

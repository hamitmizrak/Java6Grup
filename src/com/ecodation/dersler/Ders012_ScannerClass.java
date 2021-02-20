package com.ecodation.dersler;

import java.util.Scanner;

public class Ders012_ScannerClass {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String email, password;

		System.out.println("Lütfen email adresinizi giriniz.");
		email = klavye.nextLine();

		System.out.println("Lütfen şifrenizi giriniz.");
		password = klavye.nextLine();

		System.out.println(email + " " + password);

	}

}

package com.ecodation.ornekler;

public class Ornekler_007_TryCatch {

	public static void main(String[] args) {
		System.out.println("öncesi");

		try {
			int a = 4 / 0;
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Hata meydana geldi");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			// mail gönderme metodu
		}

		System.out.println("sonrası");
	}
}

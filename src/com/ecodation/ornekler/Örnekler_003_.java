package com.ecodation.ornekler;

public class Örnekler_003_ {

	public static void main(String[] args) {
		String kelime = "Bugün Hava Çok Güzel";
		String[] dizi = kelime.split(" ");
		for (String a : dizi) {
			System.out.println(a);
		}
		/*
		 * Şöyle bir kod yazdım bunun çıktısı Bugün Hava Çok Güzel Şeklinde
		 */
		System.out.println(dizi[3]);
		// Bu kodun çıltısı da Güzel şeklinde ama
		if (dizi[3].equals("Güzel")) {
			System.out.println("dizinin 4 değeri Güzel");
		}
	}
}

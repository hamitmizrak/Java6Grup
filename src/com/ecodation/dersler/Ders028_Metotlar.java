package com.ecodation.dersler;

public class Ders028_Metotlar {

	// VOIDLI
	public static void voidliParametresizMethod() {
		System.out.println("Merhabalar voidli Parametresiz Method ");
	}

	public static void voidliParametreliMethod(String ad) {
		System.out.println("Merhabalar voidli Parametreli Method " + ad);
	}

	// VOIDSIZ
	public static String voidsizParametresizMethod() {
		return "geri donus";
	}

	public static String voidsizParametreliMethod(String ad, String soyad) {
		return ad + " " + soyad;
	}

	public static void main(String[] args) {
		voidliParametresizMethod();

		voidliParametreliMethod("Hamit Mızrak");

		String voidsizParametresiz = voidsizParametresizMethod();
		System.out.println(voidsizParametresiz);

		String voidsizParametresli = voidsizParametreliMethod("Hamit", "Mızrak");
		System.out.println(voidsizParametresli);

	}

}

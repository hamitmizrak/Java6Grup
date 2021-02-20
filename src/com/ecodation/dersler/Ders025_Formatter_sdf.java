package com.ecodation.dersler;

public class Ders025_Formatter_sdf {

	public static void main(String[] args) {
		// SeDeF
		String isim = "Hamit Mızrak";
		int plaka = 44;
		float virgullu = 44.44f;

		// System.out.println(); alt satıra geçer
		// System.out.print(); alt satıra geçmez
		System.out.printf("%s %5d %10.2f", isim, plaka, virgullu);

		System.out.println();

		System.out.println(isim + " " + plaka + " " + virgullu);

	}

}

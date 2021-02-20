package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_005_NegatifPozitif {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in); // Ctrl+Shift+O

		while (true) {
			System.out.println("Lütfen bir sayı giriniz");
			int sayi = klavye.nextInt();

			/*
			 * if (sayi < 0) { System.out.println("Negatif girdiniz"); } else { System.out.println("Pozitif girdiniz");
			 * }
			 */

			/*
			 * if (sayi < 0) System.out.println("Negatif girdiniz"); else System.out.println("Pozitif girdiniz");
			 */

			/*
			 * String str = sayi < 0 ? "Negatif sayı girdiniz" : "pozitif sayı girdiniz"; System.out.println(str);
			 */

			System.out.println(sayi < 0 ? "Negatif sayı girdiniz" : "pozitif sayı girdiniz");
		}

	}
}

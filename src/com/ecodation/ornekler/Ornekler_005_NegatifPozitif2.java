package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_005_NegatifPozitif2 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in); // Ctrl+Shift+O
		int sayi;

		while (3 > 1) { // true
			System.out.println("Lütfen bir sayı giriniz");
			sayi = klavye.nextInt();
			System.err.println(sayi < 0 ? "Negatif sayı girdiniz\n" : "pozitif sayı girdiniz\n");
			if (sayi == 0)
				break;
		}

	}
}

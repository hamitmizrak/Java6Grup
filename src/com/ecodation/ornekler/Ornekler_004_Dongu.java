package com.ecodation.ornekler;

public class Ornekler_004_Dongu {

	public static void main(String[] args) {

		// 1 -10 sayıları toplayalım
		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15);

		int toplam = 0;// initial counter toplamada: sıfır(0) etkisizdir.
		for (int i = 0; i <= 5; i++) {
			if (i == 1)
				continue;
			if (i == 5)
				break;
			toplam += i;

		}
		System.out.println(toplam);

	}
}

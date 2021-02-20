package com.ecodation.dersler;

import java.util.Arrays;

public class Ders031_Diziler3 {

	public static void main(String[] args) {

		int[] dizi = { 5555, 11, 22, 3, 9, 66, 775 };

		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}

	}

}

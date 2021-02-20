package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_008_HaftaninGunleri {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		String str = "", newValue = "";// global değişken //nulPointerException yaşamamak için
		try { // istisna yakalayı ekledik
			while (true) { // sonsuz döngüye girdi
				System.out.println("Lütfen gün giriniz");
				str = klavye.nextLine().toLowerCase();
				newValue = "Günlerden ";
				switch (str) {
					case "pazartesi":
						System.out.println(newValue + str);
						break;
					case "sali":
						System.out.println(newValue + str);
						break;
					case "çarşamba":
						System.out.println(newValue + str);
						break;
					case "perşembe":
						System.out.println(newValue + str);
						break;
					case "cuma":
						System.out.println(newValue + str);
						break;
					case "pazar":
						System.out.println(newValue + str);
						break;
					case "cumartesi":
						System.out.println(newValue + str);
						break;
					default:
						System.out.println("yanlış girdiniz");
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
}

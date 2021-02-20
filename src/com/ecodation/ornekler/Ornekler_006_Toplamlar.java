package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_006_Toplamlar {
	/*
	 * 1 den 10 kadar sayıların toplamı 2 e bölünebilen sayıların toplamı
	 * 
	 */
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int toplam = 0, karar, baslangic, bitis;

		System.out.println("Başlangıç sayıyısını giriniz");
		baslangic = klavye.nextInt();

		System.out.println("Bitiş sayıyısını giriniz");
		bitis = klavye.nextInt();

		try {
			while (2 > -8) {
				System.out.println("Lütfen bir seçim yapınız");
				System.out.println("1-) toplam sonucu\n2-) çift sayılar toplamı\n3-)Teksayı toplamları\n4-)çıkış");
				karar = klavye.nextInt();

				switch (karar) {
					case 1:
						toplam = 0;
						for (int i = baslangic; i <= bitis; i++) {
							toplam = toplam + i;
						}
						System.out.println(toplam);
						break;
					case 2:
						toplam = 0;
						for (int i = baslangic; i <= bitis; i++) {
							if (i % 2 == 0) {
								toplam = toplam + i;
							}
						}
						System.out.println(toplam);
						break;
					case 3:
						toplam = 0;
						for (int i = baslangic; i <= bitis; i++) {
							if (i % 2 == 1) {
								toplam += i;
							}
						}
						System.out.println(toplam);
						break;
					case 4:
						System.out.println("çıkış yapılıyor...");
						System.exit(0);
						break;

					default:
						System.out.println("Belirtilen sayıyı giriniz");
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// throw new ArithmeticException("Burada kal");

	}
}

package com.ecodation.ornekler;

import java.util.Scanner;

public class Ornekler_009_HesapMakinasi {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int number1, number2, chooiseNumber;

		System.out.println("1.sayı");
		number1 = klavye.nextInt();

		System.out.println("2.sayı");
		number2 = klavye.nextInt();

		while (true) {
			try {
				// System.out.println("devam etmek için bir tuşa basınız");
				// klavye.hasNext();
				System.out.println("Lütfen bir seçim yapınız");
				System.out.println("1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme\n5-)Çıkış");
				chooiseNumber = klavye.nextInt();

				switch (chooiseNumber) {
					case 1:
						int toplam = number1 + number2;
						System.out.println(
								"1.sayıyınız: " + number1 + "ile 2.sayınız:" + number2 + " toplamı= " + toplam);
						break;
					case 2:
						int cikarma = number1 - number2;
						System.out.println(
								"1.sayıyınız: " + number1 + "ile 2.sayınız:" + number2 + " cikarma= " + cikarma);
						break;
					case 3:
						int carpma = number1 * number2;
						System.out
								.println("1.sayıyınız: " + number1 + "ile 2.sayınız:" + number2 + " çarpım= " + carpma);
						break;
					case 4:
						int bolme = number1 / number2;
						System.out.println("1.sayıyınız: " + number1 + "ile 2.sayınız:" + number2 + " bolme= " + bolme);
						break;
					case 5:
						System.out.println("Çıkış yapılıyor.....");
						System.exit(0);
						break;

					default:
						System.out.println("Lütfen belirtilen aralıkta sayıları giriniz");
						break;

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			klavye.close();
		}
	}
}

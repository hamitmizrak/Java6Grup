package com.ecodation.ornekler;

import java.util.Random;
import java.util.Scanner;

/* 
 
 konsoldan kaç elemanlı elemanlı bir dizi olacak bu elemanlara rastgele sayılar girilecek
-a) başlangıç ve bitişi consolden kullanıcı yazacak
-b) ilk sayı ile son sayının toplamını alalım.
-c) bütün sayılar toplamı
-d) metota verecem metot şunu yapacak girilen sayının 10 küçük olup olmadığını kontol edecek.
 */
public class Ornekler_010_DiziToplam {

	public static int[] scannerArray() {
		Scanner klavye = new Scanner(System.in);
		int elemanSayisi, diziBaslangic, diziBitis, rastgeleBaslangic, rastgeleBitis;
		System.out.println("Eleman sayısını giriniz");
		elemanSayisi = klavye.nextInt(); // 0
		System.out.println("dizi başlangıç sayısını giriniz");
		diziBaslangic = klavye.nextInt();// 1
		System.out.println("dizi bitiş sayısını giriniz");
		diziBitis = klavye.nextInt();// 2
		System.out.println("rastgele başlangıç sayısını giriniz");
		rastgeleBaslangic = klavye.nextInt();// 3
		System.out.println("rastgele bitiş sayısını giriniz");
		rastgeleBitis = klavye.nextInt();// 4
		int[] dizi = { elemanSayisi, diziBaslangic, diziBitis, rastgeleBaslangic, rastgeleBitis };
		return dizi;
	}

	public static void sonucArray(int[] dizi) {
		int rastSayi, toplam = 0;
		// 0.indisi eleman sayısını
		int[] sonucDizi = new int[dizi[0]];
		Random rastgeleSayilar = new Random();
		for (int i = dizi[1]; i < dizi[0]; i++) {
			rastSayi = rastgeleSayilar.nextInt(dizi[4]) + dizi[3];
			sonucDizi[i] = rastSayi;
		}
		for (int temp : sonucDizi) {
			System.out.print(temp + " ");
		}

		for (int i = 0; i < sonucDizi.length; i++) {
			toplam = toplam + sonucDizi[i];
		}

		System.out.println("\nbaşlangıç: " + sonucDizi[0]);
		System.out.println("\nbitiş: " + sonucDizi[sonucDizi.length - 1]);
		System.out.println("\nToplam: " + toplam);

	}

	public static void main(String[] args) {
		sonucArray(scannerArray());
	}

}

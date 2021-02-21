package com.ecodation.collections;

import java.util.LinkedList;
import java.util.List;

public class ListCollections3 {

	// List = Tekrarlı veya Tekrarsız veriler
	// Set = Tekrarsız veriler
	// Map = Key ,Value olarak değişir.

	// eleman sayısı belli olmayan durumlarda kullanıyoruz.

	// L- A -V
	// LinkedList = Araya yerleşme ,Silme
	// ArrayList = ekleme ,arama işlemlerinde
	// Vector

	public static void main(String[] args) {

		List<String> sehirList = new LinkedList<>();
		sehirList.add("Malatya");
		sehirList.add("Ankara");
		sehirList.add("İstanbul");
		sehirList.add("Kayseri");

		if (sehirList.contains("Malatya44")) {
			System.out.println("Malatya bu listede vardır");
		} else {
			System.out.println("Yoktur");
		}

		for (Object temp : sehirList) {
			System.out.println(temp);
		}

	}

}

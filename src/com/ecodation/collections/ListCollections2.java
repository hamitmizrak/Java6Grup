package com.ecodation.collections;

import java.util.LinkedList;
import java.util.List;

public class ListCollections2 {

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

		List<String> sehirList2 = new LinkedList<>();
		sehirList2.add("Mersin");
		sehirList2.add("Elazığ");
		sehirList2.add("Bursa");

		sehirList.addAll(sehirList2);

		for (Object temp : sehirList) {
			System.out.println(temp);
		}

	}

}

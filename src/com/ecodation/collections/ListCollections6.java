package com.ecodation.collections;

import java.util.LinkedList;
import java.util.List;

public class ListCollections6 {

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

		System.out.println(sehirList.size());

	}

}

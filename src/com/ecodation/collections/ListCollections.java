package com.ecodation.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollections {

	// List = Tekrarlı veya Tekrarsız veriler
	// Set = Tekrarsız veriler
	// Map = Key ,Value olarak değişir.

	// eleman sayısı belli olmayan durumlarda kullanıyoruz.

	// L- A -V
	// LinkedList = Araya yerleşme ,Silme
	// ArrayList = ekleme ,arama işlemlerinde
	// Vector

	public static void main(String[] args) {

		List<String> sehirList = new ArrayList<>();
		sehirList.add("Malatya");
		sehirList.add("Ankara");
		sehirList.add("İstanbul");
		sehirList.add("Kayseri");

		Iterator ite = sehirList.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("--------------");
		for (Object temp : sehirList) {
			System.out.println(temp);
		}
		System.out.println("--------------");
		sehirList.remove(0);
		for (Object temp : sehirList) {
			System.out.println(temp);
		}
		sehirList.clear();
		for (Object temp : sehirList) {
			System.out.println(temp);
		}
		System.out.println("-------------");

	}

}

package com.ecodation.collections;

public class SetCollections {

	// List = Tekrarlı veya Tekrarsız veriler
	// Set = Tekrarsız veriler
	// Map = Key ,Value olarak değişir.

	// eleman sayısı belli olmayan durumlarda kullanıyoruz.

	// L- A -V
	// LinkedList = Araya yerleşme ,Silme
	// ArrayList = ekleme ,arama işlemlerinde
	// Vector

	public static void main(String[] args) {

		java.util.Set<String> sehirList = new java.util.TreeSet<>();
		sehirList.add("Malatya");
		sehirList.add("Ankara");
		sehirList.add("İstanbul");
		sehirList.add("Kayseri");
		sehirList.add("Kayseri");
		sehirList.add("Kayseri");

		for (Object temp : sehirList) {
			System.out.println(temp);
		}
		System.out.println("--------------");

	}

}

package com.ecodation.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollections {

	// List = Tekrarlı veya Tekrarsız veriler
	// Set = Tekrarsız veriler
	// Map = Key ,Value olarak değişir.

	// eleman sayısı belli olmayan durumlarda kullanıyoruz.

	// L- A -V
	// LinkedList = Araya yerleşme ,Silme
	// ArrayList = ekleme ,arama işlemlerinde
	// Vector

	public static void main(String[] args) {

		Map<Integer, Object> mapList = new HashMap<Integer, Object>();
		mapList.put(1, "Çağlar");
		mapList.put(2, "Doğa");
		mapList.put(3, "Duygu");
		mapList.put(4, "Ekin");
		mapList.put(5, "Emre");
		mapList.put(6, "Esra");
		mapList.put(7, "Sarp");

		mapList.put(8, "Hamit");
		mapList.put(8, "Seda");
		mapList.put(8, "Ahmet");

		// lambda expression
		// mapList.entrySet().forEach(System.out::println);
		Set set = mapList.keySet();

		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(mapList.get(ite.next()));
		}

	}

}

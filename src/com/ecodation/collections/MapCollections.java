package com.ecodation.collections;

import java.util.HashMap;
import java.util.Map;

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
		mapList.put(8, "Seda");

		// lambda expression
		mapList.entrySet().forEach(System.out::println);

		System.out.println("-------------------");
		// key sadece
		for (Integer tempNumber : mapList.keySet()) {
			System.out.print(tempNumber + " ");
		}

		System.out.println("\n++++++++++++++++++");
		// value sadece
		for (Object tempObject : mapList.values()) {
			System.out.print(tempObject + " ");
		}

	}

}

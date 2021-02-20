package com.ecodation.dersler;

public class Ders017_Stringbuilder {

	public static void main(String[] args) {

		// 1 (artı operant)
		System.out.println("Hamit" + "Mızrak" + "Java");

		// 2 (String concat)
		String kelime = "HamitMızrak".concat("Java");
		System.out.println(kelime);

		// 3 Stringbuilder(Daha hızlı ancak buffera göre güvensiz)
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			builder.append(i);
		}
		// builder.append("Hamit").append("Mızrak").append("Java").append(" ");
		String toparla = builder.toString();
		System.out.println(toparla);

		// 4 StringBuffer (Daha gücvenli ancak yavaş)
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hamit").append("Mızrak").append("Java").append(" ");
		String toparla2 = buffer.toString();
		System.out.println(toparla2);
	}

}

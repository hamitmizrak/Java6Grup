package com.ecodation.dersler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ders018_Tarih {

	public static void main(String[] args) {

		Locale lokal = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd - MMMM - yyyy hh:mm:ss zzzz", lokal);

		Date tarih = new Date();
		System.out.println(tarih);

		tarih.setDate(12);
		String donustur = simpleDateFormat.format(tarih);
		System.out.println(donustur);

		// System.out.println(tarih.getDate());
		// System.out.println(tarih.getMinutes());
		// System.out.println(tarih.getSeconds());

	}

}

package com.ecodation.dersler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Ders019_Calendar {

	public static void main(String[] args) {

		Locale lokal = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd - MMMM - yyyy hh:mm:ss zzzz", lokal);

		Calendar tarih = Calendar.getInstance();
		System.out.println(tarih.getTime());

		String donustur = simpleDateFormat.format(tarih.getTime());
		System.out.println(donustur);

		// System.out.println(tarih.getDate());
		// System.out.println(tarih.getMinutes());
		// System.out.println(tarih.getSeconds());

	}

}

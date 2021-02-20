package com.ecodation.interfaces;

public class MainTest {

	public static void main(String[] args) {

		MSI msi = new MSI();
		msi.setAdi("MSİ");
		msi.setCpu("3");
		msi.setId(1);
		msi.setAdi("msi GL75");
		msi.setAnakart("GKLsd52");
		msi.setRam("16GB");

		// polymorphism
		msi.ac();
		msi.flimIzle();
		msi.kapat();
		msi.boyut();

		System.out.println("----------");
		Asus asus = new Asus();
		asus.setAdi("ASUS");
		asus.setCpu("4");
		asus.setId(1);
		asus.setAnakart("ssdsLsd52");
		asus.setRam("8GB");

		// polymorphism
		asus.ac();
		asus.flimIzle();
		asus.kapat();
		asus.boyut();

	}

}

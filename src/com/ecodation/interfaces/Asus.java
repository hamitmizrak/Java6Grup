package com.ecodation.interfaces;

import java.io.Serializable;

public class Asus extends OrtakOzellikler implements IBilgisayar, Serializable {
	private static final long serialVersionUID = -6765835854130472429L;

	public Asus() {

	}

	@Override
	public void ac() {
		System.out.println(this.getAdi() + " açılıyor");
	}

	@Override
	public void sifreGir() {
		System.out.println(this.getAdi() + " şifre giriliyor");
	}

	@Override
	public void kodYaz() {
		System.out.println(this.getAdi() + " kod yazılıyor");
	}

	@Override
	public void flimIzle() {
		System.out.println(this.getAdi() + " film izleniyor");
	}

	@Override
	public void kapat() {
		System.out.println(this.getAdi() + " kapatılıyor");
	}

	@Override
	public void abractGenelOzellikler() {
		System.out.println("Genel ortak özellikler:" + getId() + getAdi() + getAnakart() + getCpu() + getRam());

	}

	@Override
	public void boyut() {
		System.out.println(Boyut.kucuk);

	}

}

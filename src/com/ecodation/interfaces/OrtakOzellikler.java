package com.ecodation.interfaces;

abstract public class OrtakOzellikler {

	// nesne değişkenleri
	private long id;
	private String adi;
	private String anakart;
	private String cpu;
	private String ram;
	private String boyut;

	// parametresiz kurucu method
	public OrtakOzellikler() {
		this.id = 0;
		this.anakart = "cfx-220";
		this.cpu = "2.2GZ";
		this.ram = "4GB";
		this.adi = "ad girilmedi";
	}

	public void idAnakart() {
		System.out.println(getId() + " " + getAnakart());
	}

	abstract public void abractGenelOzellikler();

	// parametreli kurucu method
	public OrtakOzellikler(long id, String anakart, String cpu, String ram, String adi, String boyut) {
		super();
		this.id = id;
		this.anakart = anakart;
		this.cpu = cpu;
		this.ram = ram;
		this.adi = adi;
		this.boyut = boyut;
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAnakart() {
		return anakart;
	}

	public void setAnakart(String anakart) {
		this.anakart = anakart;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

}

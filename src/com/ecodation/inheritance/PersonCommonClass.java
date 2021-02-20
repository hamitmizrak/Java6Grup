package com.ecodation.inheritance;

public class PersonCommonClass {

	// nesne değişkenleri
	private long id;
	private String adi;

	// parametresiz constructor
	public PersonCommonClass() {
		this.id = 0; // Db AI alanında otomatik olarak devam edilir.
		this.adi = "adı alanı girilmedi";
	}

	// parametreli constructor
	public PersonCommonClass(long id, String adi) {
		this.id = id;
		this.adi = adi;
	}

	public void dneme() {
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	// toString
	@Override
	public String toString() {
		return "PersonCommonClass [id=" + id + ", adi=" + adi + "]";
	}

}

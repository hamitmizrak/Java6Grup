package com.ecodation.oop;

//Bean=pojo+constructor+toString
public class StudentBean {

	// nesne değişkeni
	private String adi;
	private String soyadi;

	// parametresiz constructor
	public StudentBean() {
		this.adi = "Ad girmediniz";
		this.soyadi = "Soyad girmediniz";
	}

	// parametreli constructor
	public StudentBean(String adi, String soyadi) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
	}

	// toString
	@Override
	public String toString() {
		return "StudentBean [adi=" + adi + ", soyadi=" + soyadi + "]";
	}

	// getter and setter
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

}

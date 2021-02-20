package com.ecodation.oop;

//pojo
public class StudentPojo {

	// nesne değişkeni
	private String adi;
	private String soyadi;

	// composition
	private StudentBean bean;

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

	public StudentBean getBean() {
		return bean;
	}

	public void setBean(StudentBean bean) {
		this.bean = bean;
	}

}

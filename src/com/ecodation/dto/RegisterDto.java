package com.ecodation.dto;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "registerDto")
@SessionScoped
public class RegisterDto implements Serializable {
	private static final long serialVersionUID = -1378229006065296106L;
	//nesne değişkenlerimiz
	private long id;
	private String name;
	private String surname;
	private String password;
	private String emailAddress;
	private Date creationDate;
	
	//parametresiz constructor
	public RegisterDto() {
		this.name="adiniz";
		this.surname="soyadiniz";
		this.password="root";
		this.emailAddress="emailadres@gmail.com";
	}
	
	//parametreli constructor
	public RegisterDto(long id, String name, String surname, String password, String emailAddress, Date creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.emailAddress = emailAddress;
		this.creationDate = creationDate;
	}



	//getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	//toString
	@Override
	public String toString() {
		return "RegisterDto [id=" + id + ", name=" + name + ", surname=" + surname + ", password=" + password
				+ ", emailAddress=" + emailAddress + ", creationDate=" + creationDate + "]";
	}
	
	
}

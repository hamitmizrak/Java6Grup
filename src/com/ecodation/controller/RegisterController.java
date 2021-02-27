package com.ecodation.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.ecodation.dao.RegisterDao;
import com.ecodation.dto.RegisterDto;
import com.ecodation.utils.IDbInterfaces;

@Named(value = "registerController")
@SessionScoped
public class RegisterController implements Serializable, IDbInterfaces<RegisterDto> {
	private static final long serialVersionUID = 1900648399094868176L;

	private RegisterDto registerDto;
	private RegisterDao registerDao;
	private ArrayList<RegisterDto> registerList;
	private boolean result = false;

	public RegisterController() {
		this.registerDao = new RegisterDao();
		this.registerDto = new RegisterDto();
		list();
	}

	@Override
	public void create(RegisterDto registerDto) {
		System.out.println("\nCreate yapılıyor.");
		this.registerDao.create(registerDto);

	}

	@Override
	public void update(RegisterDto registerDto) {
		System.out.println("\nUpdate yapılıyor.");
		this.registerDao.update(registerDto);

	}

	@Override
	public void delete(RegisterDto registerDto) {
		System.out.println("\nDelete yapılıyor.");
		this.registerDao.delete(registerDto);

	}

	@Override
	public ArrayList<RegisterDto> list() {
		System.out.println("\nList yapılıyor.");
		registerList = this.registerDao.list();
		return registerList;
	}

	// Methods
	public void resultMethod() {
		if(this.result==false) {
			System.out.println("bu sayfaya erişiminiz yoktur. ");
		}else{
			System.out.println("Admin Sayfasına Hoş geldiniz");
			Scanner klavye = new Scanner(System.in);
			int chooise;
			while (true) {
				System.out.println("1-)Ekleme\n2-)Silme\n3-)Güncelleme\n4-)Listeleme\n5-)Çıkış");
				chooise = klavye.nextInt();
				switch (chooise) {
					case 1:
						System.out.println("EKLEME YAPILIYOR::::");
						createSwitch();
						break;
					case 2:
						System.out.println("Silme YAPILIYOR::::");
						deleteSwitch();
						break;
					case 3:
						System.out.println("Güncelleme YAPILIYOR::::");
						updateSwitch();
						break;
					case 4:
						System.out.println("Listeleme YAPILIYOR::::");
						listSwitch();
						break;
					case 5:
						System.out.println("Çıkış yapılıyor YAPILIYOR::::");
						System.exit(0);
						break;

					default:
						System.out.println("Lütfen belirtilen sayıyı giriniz");
						break;
				}
			}

		}

	}

	private void listSwitch() {
	ArrayList<RegisterDto> gelenList=	list();
	for(RegisterDto temp : gelenList) {
		System.out.println(temp);
	}
		
	}

	private void updateSwitch() {
		Scanner klavye = new Scanner(System.in);
		RegisterDto registerDto=new RegisterDto();
		String name,surname,password,email;
		long id;
		
		//System.out.println("bir tuşa basınız");
		//klavye.next();
		
		System.out.println("Güncellenecek Adınızı giriniz");
		name=klavye.nextLine();
		registerDto.setName(name);
		
		
		System.out.println("Güncellenecek Soyadınız giriniz");
		surname=klavye.nextLine();
		registerDto.setSurname(surname);
		
		
		System.out.println("Güncellenecek Password giriniz");
		password=klavye.nextLine();
		registerDto.setPassword(password);
		
		
		System.out.println("Güncellenecek Email giriniz");
		email=klavye.nextLine();
		registerDto.setEmailAddress(email);
		
		System.out.println("Güncellenecek ID giriniz");
		id=klavye.nextLong();
		registerDto.setId(id);
		
		update(registerDto);
		
	}

	private void deleteSwitch() {
		Scanner klavye = new Scanner(System.in);
		RegisterDto registerDto2=new RegisterDto();
		System.out.println("Lütfen silmek istediğiniz ID giriniz");
		long id;
		id=klavye.nextInt();
		registerDto2.setId(id);
		delete(registerDto2);
		
	}

	private void createSwitch() {
		Scanner klavye = new Scanner(System.in);
		RegisterDto registerDto=new RegisterDto();
		String name,surname,password,email;
		
		//System.out.println("bir tuşa basınız");
		//klavye.next();
		
		System.out.println("Adınızı giriniz");
		name=klavye.nextLine();
		registerDto.setName(name);
		
		
		System.out.println("Soyadınız giriniz");
		surname=klavye.nextLine();
		registerDto.setSurname(surname);
		
		
		System.out.println("Password giriniz");
		password=klavye.nextLine();
		registerDto.setPassword(password);
		
		
		System.out.println("Email giriniz");
		email=klavye.nextLine();
		registerDto.setEmailAddress(email);
		
		create(registerDto);
		
	}

	// getter and setter
	public RegisterDto getRegisterDto() {
		return registerDto;
	}

	public void setRegisterDto(RegisterDto registerDto) {
		this.registerDto = registerDto;
	}

	public RegisterDao getRegisterDao() {
		return registerDao;
	}

	public void setRegisterDao(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}

	public ArrayList<RegisterDto> getRegisterList() {
		return registerList;
	}

	public void setRegisterList(ArrayList<RegisterDto> registerList) {
		this.registerList = registerList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

}

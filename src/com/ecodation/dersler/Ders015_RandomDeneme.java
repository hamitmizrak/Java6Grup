package com.ecodation.dersler;

import java.util.Random;
import java.util.Scanner;

public class Ders015_RandomDeneme {

	public static void main(String[] args) {
	
		//Math düzeyde random
		System.out.println("Math:"+ Math.round(Math.random()*5+1));
		
		//Sınıf düzeyde random(OOP) daha yakın
		//import java.util.Random;
		Random sinifRandom=new Random();
		int sayi=sinifRandom.nextInt(5)+1;
		System.out.println("Sınıf:"+sayi);
		

	}

}

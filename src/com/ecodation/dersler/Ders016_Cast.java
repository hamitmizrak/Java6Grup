package com.ecodation.dersler;

import java.util.Random;
import java.util.Scanner;

public class Ders016_Cast {

	public static void main(String[] args) {
	//cast-1  f-L
	float f1=4.55f;
	long l1=45515252L;
	
	//cast-2  b<s<i<l
	//küçük sayıyı büyüğe
	byte b2=127;
	long l2=b2;
		
	long l3=525256L;
	short s3=(short)l3;
	
	//cast-3
	//String'ten sayiya
	String str="5";
	int sayi=Integer.valueOf(str);
	System.out.println(5+str);
	System.out.println(5+sayi);
	
	//int String'
	int sayi5=65;
	String str5=String.valueOf(sayi5);
	
	//cast-4
	//primitive Wrapper'e çevirdim (Boxing)
	int primitive=44;//primitive 
	Integer referans=primitive; //Wrapper
	
	// Wrapper'ı primitive çevirdim (UnBoxing)
	Integer referans2=new Integer(55);
	int primitive2=referans2;
	
	
	

	}

}

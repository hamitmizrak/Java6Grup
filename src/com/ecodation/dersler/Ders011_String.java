package com.ecodation.dersler;

public class Ders011_String {

	
	public static void main(String[] args) {

		String kelime="Java SE Java EE , JSP JSF Spring ";
		
		System.out.println(kelime.length());
		
		System.out.println(kelime.toUpperCase());
		System.out.println(kelime.toLowerCase());
		
		System.out.println(kelime.trim().length());
		System.out.println(kelime.substring(5));
		System.out.println(kelime.substring(0,6)); // 0<=x<=6-1
		
		System.out.println(kelime.charAt(2));
		System.out.println(kelime.indexOf("J"));
		System.out.println(kelime.lastIndexOf("g"));
		
		System.out.println(kelime.concat("Hibernate"));
		
		//search
		System.out.println(kelime.contains("44"));
		System.out.println("başlama: "+kelime.startsWith("J"));
		System.out.println("bitiş:"+kelime.endsWith(" "));
		
		System.out.println(kelime.replace("JSP", "Servlet"));
		
		System.out.println("---------------------");
		//split
		String [] dizi=kelime.split(",");
		for(String temp: dizi) {
			System.out.println(temp);
		}
		
		System.out.println(dizi[0]);
		
		
		System.out.println("+++++++++++++++++++");
		System.out.println(kelime==("Java SE Java EE JSP JSF Spring "));
		System.out.println(kelime.equals("Java SE Java EE JSP JSF Spring "));
		System.out.println(kelime.compareTo("Java SE Java EE JSP JSF Spring "));
		
		//sayılarda
		int a=5;
		int b=5;
		System.out.println(a==b);
		
		System.out.println("************************");
		System.out.println(kelime.isEmpty());
		
		char c1='\u4537';
		System.out.println(c1);
		
		
		
		
	
	
	}
	
}

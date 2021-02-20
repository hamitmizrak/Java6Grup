package com.ecodation.dersler;

import java.util.StringTokenizer;

public class Ders020_StringTokenizer {

	public static void main(String[] args) {

		String kelime = "Html5 ,Css3 & Js Jquery, Bootstrap Angular Vue JavaSE, JavaEE JSF JSP Servlet Primefaces, Mysql + Mssql  MariaDb";

		String temp = "";
		StringTokenizer stringTokenizer = new StringTokenizer(kelime, "+, "); // defaultta: boşluk
		while (stringTokenizer.hasMoreTokens()) {
			temp = stringTokenizer.nextToken();
			System.out.println(temp);
		}

	}

}

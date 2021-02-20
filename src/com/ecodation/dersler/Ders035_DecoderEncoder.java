package com.ecodation.dersler;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class Ders035_DecoderEncoder {

	// methods
	public String EncoderMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz.");
		String kelime = klavye.nextLine();
		Encoder encoder = Base64.getEncoder();
		String sifre = encoder.encodeToString(kelime.getBytes());
		System.err.println(sifre);
		return sifre;
	}

	public String DecoderMethod(String sifrelenmisKelime) {
		java.util.Base64.Decoder decoder = Base64.getDecoder();
		String sifreCoz = new String(decoder.decode(sifrelenmisKelime));
		System.err.println(sifreCoz);
		return sifreCoz;
	}

	public static void main(String[] args) {

		Ders035_DecoderEncoder sifre = new Ders035_DecoderEncoder();
		// sifre.EncoderMethod();
		sifre.DecoderMethod(sifre.EncoderMethod());
	}

}

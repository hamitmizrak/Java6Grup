package com.ecodation.innerclass;

import com.ecodation.innerclass.Ulke.Sehirler;
import com.ecodation.innerclass.Ulke.Sehirler.Mahalle;

public class InnerMainTest {

	public static void main(String[] args) {

		Ulke ulke = new Ulke();
		System.out.println(ulke.getUlkeAdi());

		Sehirler sehirler = ulke.new Sehirler();
		System.out.println(sehirler.getSehirAdi());

		Mahalle mahalle = sehirler.new Mahalle();
		System.out.println(mahalle.getMahalleAdi());

		Ulke.Sehirler.Mahalle mahalle2 = new Ulke().new Sehirler().new Mahalle();

	}

}

package deneme;

import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

import com.ecodation.inheritance.PersonCommonClass;

public class ButunClasslar {

	private String adi;

	public static void main(String[] args) {
		Student44 b2 = new Student44();
		RandomID44 b3 = new RandomID44();

	}
}

class Student44 extends PersonCommonClass {

	public static void main(String[] args) throws IOException, ArithmeticException, ArrayIndexOutOfBoundsException {

		try {
			// kodlar
			int x = 4 / 0;
			System.out.println(x);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new ArithmeticException("Sıfıra bölemezsin");
		} finally {
			System.out.println("Ne olursa olsun burası çalışacak");
			System.out.println("connection.close()");

		}

		System.out.println("Merhabalar");
	}

}

class Teacher44 {
	String denem;
}

class RandomID44 {

	public static void main(String[] args) {

		// 32 karakterli bir şifre
		UUID id = UUID.randomUUID();
		System.out.println(id);

	}
}

class Ornekler_005_NegatifPozitif24 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in); // Ctrl+Shift+O
		int sayi;

		while (3 > 1) { // true
			System.out.println("Lütfen bir sayı giriniz");
			sayi = klavye.nextInt();
			System.err.println(sayi < 0 ? "Negatif sayı girdiniz\n" : "pozitif sayı girdiniz\n");
			if (sayi == 0)
				break;
		}

	}
}

class Ornekler_009_HesapMakinasi44 {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int number1, number2, chooiseNumber;

		System.out.println("1.sayı");
		number1 = klavye.nextInt();

		System.out.println("2.sayı");
		number2 = klavye.nextInt();

		while (true) {
			try {
				// System.out.println("devam etmek için bir tuşa basınız");
				// klavye.hasNext();
				System.out.println("Lütfen bir seçim yapınız");
				System.out.println("1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme\n5-)Çıkış");
				chooiseNumber = klavye.nextInt();

				switch (chooiseNumber) {
					case 1:
						int toplam = number1 + number2;
						System.out.println(
								"1.sayıyınız: " + number1 + "ile 2.sayınız:" + number2 + " toplamı= " + toplam);
						break;
					case 2:
						int cikarma = number1 - number2;
						System.out.println(
								"1.sayıyınız: " + number1 + "ile 2.sayınız:" + number2 + " cikarma= " + cikarma);
						break;
					case 3:
						int carpma = number1 * number2;
						System.out
								.println("1.sayıyınız: " + number1 + "ile 2.sayınız:" + number2 + " çarpım= " + carpma);
						break;
					case 4:
						int bolme = number1 / number2;
						System.out.println("1.sayıyınız: " + number1 + "ile 2.sayınız:" + number2 + " bolme= " + bolme);
						break;
					case 5:
						System.out.println("Çıkış yapılıyor.....");
						System.exit(0);
						break;

					default:
						System.out.println("Lütfen belirtilen aralıkta sayıları giriniz");
						break;

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			klavye.close();
		}
	}
}

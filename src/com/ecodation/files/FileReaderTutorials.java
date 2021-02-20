package com.ecodation.files;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderTutorials {

	public static void main(String[] args) {
		String okunanDeger = "", okunanSatir;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FilePath.getPath()))) {

			while ((okunanSatir = bufferedReader.readLine()) != null) {
				okunanDeger += okunanSatir;
			}
			System.out.println(okunanDeger + "");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Başarılı bir şekilde Eklendi");
		}
	}

}

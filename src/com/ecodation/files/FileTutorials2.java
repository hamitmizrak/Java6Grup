package com.ecodation.files;

import java.io.File;
import java.io.IOException;

public class FileTutorials2 {

	public static void main(String[] args) {

		try {
			String pathname = FilePath.getPath();

			File file = new File("C:\\fileIO\\java777.txt");

			if (file.createNewFile()) {
				System.out.println("oluşturuldu");
			} else {
				System.out.println("Hata");
			}

		} catch (IOException io) {
			io.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

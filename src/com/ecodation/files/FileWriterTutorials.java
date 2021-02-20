package com.ecodation.files;

import java.io.File;
import java.io.FileWriter;

public class FileWriterTutorials {

	public static void main(String[] args) {

		try {

			File file = new File(FilePath.getPath());
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.append("Deneme44");
			fileWriter.append("5555");

			fileWriter.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Başarılı bir şekilde Eklendi");
		}
	}

}

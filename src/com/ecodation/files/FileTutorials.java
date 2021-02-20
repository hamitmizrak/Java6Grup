package com.ecodation.files;

import java.io.File;

public class FileTutorials {

	public static void main(String[] args) {

		String pathname = FilePath.getPath();

		File file = new File(pathname);
		if (file.isFile()) {

			System.out.println("Dosya var ");
			System.out.println("çalışabilirinir " + file.canExecute());
			System.out.println("okunabilinir " + file.canRead());
			System.out.println("yazılabilinir mi " + file.canWrite() + "\n");

			System.out.println(file.isAbsolute());
			System.out.println(file.isDirectory());
			System.out.println("dosyadır: " + file.isFile());
			System.out.println("gizli dosya mıdır: " + file.isHidden() + "\n");

			System.out.println(file.getAbsolutePath());
			System.out.println(file.getFreeSpace());
			System.out.println(file.getName());
			System.out.println(file.getParent());
			System.out.println(file.getTotalSpace());
			System.out.println(file.getClass());

			System.out.println("path: " + file.toPath());
			System.out.println(file.toURI());
			// System.out.println(file.delete());
			// System.out.println(file.);
		} else {
			System.out.println("Bu bir klasördür yani dizindir");
		}

	}

}

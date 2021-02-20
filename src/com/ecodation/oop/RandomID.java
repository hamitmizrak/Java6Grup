package com.ecodation.oop;

import java.util.UUID;

public class RandomID {

	public static void main(String[] args) {

		// 32 karakterli bir şifre
		UUID id = UUID.randomUUID();
		System.out.println(id);

	}
}

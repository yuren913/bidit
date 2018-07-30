package com.bidforyou.bidit.example.singleton;

public class BiditSingleton2 {

	private BiditSingleton2() {

	}

	private static BiditSingleton2 instance = new BiditSingleton2();

	public static BiditSingleton2 getInstance() {
		return instance;
	}

}

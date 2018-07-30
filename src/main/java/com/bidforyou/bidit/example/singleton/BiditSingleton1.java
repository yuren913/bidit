package com.bidforyou.bidit.example.singleton;

public class BiditSingleton1 {
	
	private BiditSingleton1() {
		
	}
	
	private static BiditSingleton1 instance = null;
	
	public static BiditSingleton1 getInstance() {
		if(instance == null) {
			instance = new BiditSingleton1();
		}
		return instance;
	}
	

}

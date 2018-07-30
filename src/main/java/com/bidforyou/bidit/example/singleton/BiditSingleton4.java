package com.bidforyou.bidit.example.singleton;

public class BiditSingleton4 {
	
	private BiditSingleton4() {
		
	}
	
	private static BiditSingleton4 instance = null;
	
	public static BiditSingleton4 getInstance() {
		if(instance == null) {
			synchronized (BiditSingleton4.class) {
				if(instance == null) {
					instance = new BiditSingleton4();
				}
			}
		}
		return instance;
	}
	

}

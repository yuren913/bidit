package com.bidforyou.bidit.example.singleton;

public class BiditSingleton5 {
	
	private BiditSingleton5() {
		
	}
	
	
	//singleton : volatile + double instance check
	private volatile static BiditSingleton5 instance = null;
	
	public static BiditSingleton5 getInstance() {
		if(instance == null) {
			synchronized (BiditSingleton5.class) {
				if(instance == null) {
					instance = new BiditSingleton5();
				}
			}
		}
		return instance;
	}
	

}

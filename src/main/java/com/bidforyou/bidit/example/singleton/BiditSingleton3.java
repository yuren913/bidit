package com.bidforyou.bidit.example.singleton;

import com.bidforyou.bidit.annoations.NotRecommend;

@NotRecommend
public class BiditSingleton3 {
	
	private BiditSingleton3() {
		
	}
	
	private static BiditSingleton3 instance = null;
	
	public static synchronized BiditSingleton3 getInstance() {
		if(instance == null) {
			instance = new BiditSingleton3();
		}
		return instance;
	}
	

}

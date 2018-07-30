package com.bidforyou.bidit.example.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BiditSingleton6 {

	private BiditSingleton6() {

	}

	private static BiditSingleton6 instance = null;
	static {
		instance = new BiditSingleton6();
	}

	public static BiditSingleton6 getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		System.out.println(getInstance().hashCode());
		System.out.println(getInstance().hashCode());
	}

}

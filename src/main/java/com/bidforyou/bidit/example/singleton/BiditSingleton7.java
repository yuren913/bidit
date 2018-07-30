package com.bidforyou.bidit.example.singleton;

public class BiditSingleton7 {

	private BiditSingleton7() {

	}

	public static BiditSingleton7 getInstance() {
		return Singleton.INSTANCE.getInstance();
	}

	private enum Singleton {
		INSTANCE;

		private BiditSingleton7 singleton;

		Singleton() {
			singleton = new BiditSingleton7();
		}

		public BiditSingleton7 getInstance() {
			return singleton;
		}
	}

}

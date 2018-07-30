package com.bidforyou.bidit.example.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BidSync2 {
	// for code block
	public static void syncCodeBlock(int j) {
		synchronized (BidSync2.class) {
			for (int i = 0; i < 10; i++) {
				log.info("syncCodeBlock - {} : {}", j, i);
			}		
		}	
	}

	public static synchronized void syncFunction(int j) {
		for (int i = 0; i < 10; i++) {
			log.info("syncFunction - {} : {}", j, i);

		}
	}

	public static void main(String[] args) {
		BidSync2 bidSync1 = new BidSync2();
		BidSync2 bidSync2 = new BidSync2();
		ExecutorService exeService = Executors.newCachedThreadPool();
		exeService.execute(() ->{
			bidSync1.syncFunction(1);
		});
		exeService.execute(() ->{
			bidSync2.syncFunction(2);
		});		
	}
}

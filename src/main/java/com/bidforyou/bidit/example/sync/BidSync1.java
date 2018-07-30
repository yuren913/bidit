package com.bidforyou.bidit.example.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BidSync1 {

	// for code block
	public void syncCodeBlock(int j) {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				log.info("syncCodeBlock - {} : {}", j, i);
			}		
		}	
	}

	public synchronized void syncFunction(int j) {
		for (int i = 0; i < 10; i++) {
			log.info("syncFunction - {} : {}", j, i);

		}
	}

	public static void main(String[] args) {
		BidSync1 bidSync1 = new BidSync1();
		BidSync1 bidSync2 = new BidSync1();
		ExecutorService exeService = Executors.newCachedThreadPool();
		exeService.execute(() ->{
			bidSync1.syncFunction(1);
		});
		exeService.execute(() ->{
			bidSync2.syncFunction(2);
		});		
	}
}

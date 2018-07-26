package com.bidforyou.bidit.example.count;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import com.bidforyou.bidit.annoations.NotThreadSafe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@NotThreadSafe
public class BidConcurrent {
	public static int clientTotal = 5000;
	public static int threadTotal = 200;
	public static int localCount = 0;
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService exeService = Executors.newCachedThreadPool();
		final Semaphore semaphore = new Semaphore(threadTotal);
		final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
		for(int i =0;i< clientTotal;i++) {
			exeService.execute(() -> {
				try {
					semaphore.acquire();
					add();
					semaphore.release();					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					log.error("Exception in semaphore -> "+e);
					e.printStackTrace();
				}
				countDownLatch.countDown();
			});
		}
		countDownLatch.await();
		exeService.shutdown();
		log.info("count:{}",localCount);
	}
	private static void add() {
		localCount++;
	}

}

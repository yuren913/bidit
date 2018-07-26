package com.bidforyou.bidit.example.atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.LongAdder;

import com.bidforyou.bidit.annoations.ThreadSafe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ThreadSafe
public class BidConcurrentLongAdder {
	public static int clientTotal = 5000;
	public static int threadTotal = 200;
	public static LongAdder localCount = new LongAdder();
	
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
		localCount.increment();
	}

}

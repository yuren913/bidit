package com.bidforyou.bidit.example.atomic;

import java.util.concurrent.atomic.AtomicReference;

import com.bidforyou.bidit.annoations.ThreadSafe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ThreadSafe
public class BidConcurrentAtomicReference {
	
	private static AtomicReference<Integer> localCount = new AtomicReference<>(0);
	
	public static void main(String[] args) {
		localCount.compareAndSet(0, 2);
		localCount.compareAndSet(0, 1);
		localCount.compareAndSet(1, 3);
		localCount.compareAndSet(2, 4);
		localCount.compareAndSet(3, 5);
		log.info("count:{}",localCount.get());
	}

}

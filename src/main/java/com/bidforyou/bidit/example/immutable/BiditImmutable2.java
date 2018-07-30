package com.bidforyou.bidit.example.immutable;

import java.util.Collections;
import java.util.Map;

import com.bidforyou.bidit.annoations.NotThreadSafe;
import com.google.common.collect.Maps;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@NotThreadSafe
public class BiditImmutable2 {
	
	private static Map<Integer, Integer> map = Maps.newHashMap();
	
	static {
		map.put(1, 2);
		map.put(3, 4);
		map.put(5, 6);
		map = Collections.unmodifiableMap(map);
	}
	
	public static void main(String[] args) {
		map.put(1, 3);
		log.info("{}",map.get(1));
	}
		

}

package com.bidforyou.bidit.example.publish;

import java.util.Arrays;

import com.bidforyou.bidit.annoations.NotThreadSafe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@NotThreadSafe
public class BiditPublish {
	
	private String[] states = {"a","b","c"};
	
	public String[] getStates() {
		return states;
	}
	
	public static void main(String[] args) {
		BiditPublish biditPublish = new BiditPublish();
		log.info("{}", Arrays.toString(biditPublish.getStates()));
		
		biditPublish.getStates()[0] = "d";
		log.info("{}",Arrays.toString(biditPublish.getStates()));
				
	}

}


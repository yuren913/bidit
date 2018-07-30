package com.bidforyou.bidit.example.publish;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BiditEscape {

	private int thisCanBeEscape = 0;

	public BiditEscape() {
		new InnerClass();
	}

	private class InnerClass {
		public InnerClass() {
			log.info("{}", BiditEscape.this.thisCanBeEscape);
		}
	}

	public static void main(String[] args) {
		new BiditEscape();
	}

}

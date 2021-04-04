package javaEx.io.ThreadLocalRandom;

import java.util.concurrent.ThreadLocalRandom;

public class TestMain {
	public static void main(String[] args) {
		TestMain.Test tm = new TestMain().new Test();
		tm.test();
	}
	
	class Test{
		public void test() {
			int vari = ThreadLocalRandom.current().nextInt(1000000000);
			System.out.printf("값은 : %s 입니다. ", vari);
			
		}
	}
}

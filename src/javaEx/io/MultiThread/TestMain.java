package javaEx.io.MultiThread;

public class TestMain {

	public static void main(String[] args) {
		
		TestMain.Target1 tm1 = new TestMain().new Target1();
		TestMain.Target2 tm2 = new TestMain().new Target2();
		
		
		Thread th1 = new Thread(
			new Runnable() {
				public void run() {
					tm1.test();
				}
			}
		);
		th1.setName("threadtest1");
		th1.start();
		
		Thread th2 = new Thread(
			new Runnable() {
				public void run() {
					tm2.test();
				}
			}
		);
		th2.setName("threadtest2");
		th2.start();
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
	class Target1{
	
		public void test() {
			while(true) {
				System.out.println("test");
			}
		}
	}
	class Target2{
		
		public void test() {
			while(true) {
				
			}
		}
	}
}

package javaEx.io;

public class TestMain{

	
	public static void main(String[] args) {
		
		new Thread(
		    new TestRunnable()		
		).start();
		new Thread(
		    new TestRunnable()		
		).start();
		new Thread(
		    new TestRunnable()		
		).start();
	}
}

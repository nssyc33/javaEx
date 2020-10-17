package javaEx.io;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		TestCallBack.receive("return");
	}
}

package javaEx.io.Exception;

import java.io.IOException;

public class Ex2 {

	public void test() throws NullPointerException, IOException, Exception{
//		try {
//			throw new Exception("test입니다. 확인을 바랍니다.");
//		}catch(NullPointerException e) {
//			throw new NullPointerException("NullPointerException");
//		}catch(IOException e) {
//			throw new IOException("IOException");
//		}catch(Exception e) {
//			System.out.println("test1");
//			throw new Exception("Exception");
//		}finally {
//			System.out.println("finally에 들어왔습니다.");
//		}
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레스 실행을 합니다.");
			}
		}).start();
	}
}

package javaEx.io.Exception;

import java.io.IOException;

public class Ex2 {

	public void test() throws NullPointerException, IOException, Exception{
//		try {
//			throw new Exception("test�Դϴ�. Ȯ���� �ٶ��ϴ�.");
//		}catch(NullPointerException e) {
//			throw new NullPointerException("NullPointerException");
//		}catch(IOException e) {
//			throw new IOException("IOException");
//		}catch(Exception e) {
//			System.out.println("test1");
//			throw new Exception("Exception");
//		}finally {
//			System.out.println("finally�� ���Խ��ϴ�.");
//		}
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("������ ������ �մϴ�.");
			}
		}).start();
	}
}

package javaEx.io.Service;

import ExLib.io.ExErrorException;

public class ExError1 {
	
	public void Errortest() {
		try {
			ExError2 ee2 = new ExError2();
			ee2.test2();
			System.out.println("������ �����ϴ�.");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException ����");
			System.out.println("message : "+ e.getMessage());
			System.out.println("������ �ֽ��ϴ�.");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException ����");
			System.out.println("message : "+ e.getMessage());
			System.out.println("������ �ֽ��ϴ�.");
		}catch(Exception e) {
			System.out.println("Exception ����");
			System.out.println("message : "+ e.getMessage());
			System.out.println("������ �ֽ��ϴ�.");
		}
	}

}

package javaEx.io.Service;

import java.nio.channels.AlreadyBoundException;

public class ExError1 {
	
	public void Errortest() {
		try {
			ExError2 ee2 = new ExError2();
			ee2.test2();
		}catch(ExLib.io.ExErrorException e) {
			System.out.println("ExLib.io.ExErrorException ����");
			System.out.println("message : "+ e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException ����");
			System.out.println("message : "+ e.getMessage());
		}catch(Exception e) {
			System.out.println("�׳� ����");
			System.out.println("message : "+ e.getMessage());
		}
	}

}

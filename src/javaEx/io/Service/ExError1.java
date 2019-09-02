package javaEx.io.Service;

import java.nio.channels.AlreadyBoundException;

public class ExError1 {
	
	public void Errortest() {
		try {
			ExError2 ee2 = new ExError2();
			ee2.test2();
		}catch(ExLib.io.ExErrorException e) {
			System.out.println("ExLib.io.ExErrorException 오류");
			System.out.println("message : "+ e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 오류");
			System.out.println("message : "+ e.getMessage());
		}catch(Exception e) {
			System.out.println("그냥 오류");
			System.out.println("message : "+ e.getMessage());
		}
	}

}

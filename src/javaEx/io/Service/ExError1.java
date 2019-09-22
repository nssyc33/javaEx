package javaEx.io.Service;

import ExLib.io.ExErrorException;

public class ExError1 {
	
	public void Errortest() {
		try {
			ExError2 ee2 = new ExError2();
			ee2.test2();
			System.out.println("오류가 없습니다.");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 오류");
			System.out.println("message : "+ e.getMessage());
			System.out.println("오류가 있습니다.");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException 오류");
			System.out.println("message : "+ e.getMessage());
			System.out.println("오류가 있습니다.");
		}catch(Exception e) {
			System.out.println("Exception 오류");
			System.out.println("message : "+ e.getMessage());
			System.out.println("오류가 있습니다.");
		}
	}

}

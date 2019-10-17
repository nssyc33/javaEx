package javaEx.io.Service;

import ExLib.io.ExErrorException;

public class ExError1 {
	
	public void Errortest() {
	
			ExError2 ee2 = new ExError2();
//			ee2.test2();
			ee2.ExceptionTest();
			System.out.println("오류가 없습니다.");
		
	}

}

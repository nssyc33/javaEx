package javaEx.io.Service;

import ExLib.io.ExLibrary;


public class ExError2 {

	public void test2() throws ExErrorException, ExLib.io.ExErrorException{
		try {
			ExLibrary el = new ExLibrary();
			System.out.println("답 : "+el.devide(8, 0));
		}catch(ExLib.io.ExErrorException e) {
			System.out.println("에러 발생 : "+e.getMessage());
			throw new ExLib.io.ExErrorException("에러 발생");//--> 실제로 전송되는 Exception
		}
	}
}

package javaEx.io.Service;

import ExLib.io.ExLibrary;


public class ExError2 {

	public void test2() throws ExErrorException, ExLib.io.ExErrorException{
		try {
			ExLibrary el = new ExLibrary();
			System.out.println("�� : "+el.devide(8, 0));
		}catch(ExLib.io.ExErrorException e) {
			System.out.println("���� �߻� : "+e.getMessage());
			throw new ExLib.io.ExErrorException("���� �߻�");//--> ������ ���۵Ǵ� Exception
		}
	}
}

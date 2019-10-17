package javaEx.io.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystemException;

import javax.management.RuntimeErrorException;


public class ExError2 {

	public void test2() throws FileNotFoundException{
//		try {
//			ExLibrary el = new ExLibrary();
//			System.out.println("답 : "+el.devide(8, 0));
//		}catch(ExLib.io.ExErrorException e) {
//			System.out.println("에러 발생 : "+e.getMessage());
//			throw new ExLib.io.ExErrorException("에러 발생");//--> 실제로 전송되는 Exception
//		}
		
		String inPosition = "C://in//music.amp4";
		String outPosition = "C://in//out//music.amp4";
		System.out.println("test");
		if(true) {
			try {
				throw new FileNotFoundException();
			} catch (RuntimeException e) {
				// TODO Auto-generated catch block
				System.out.println("여기 옵니다.");
				throw new RuntimeException();
			} 
		}
		
		
	}
	
	int divide(int a, int b) {
		return a/b; 
	}
	
	public void ExceptionTest() throws RuntimeException{
		String as = null;
		int a = 100/0;
	}
	
}

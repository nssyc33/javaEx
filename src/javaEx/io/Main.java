package javaEx.io;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javaEx.io.Service.InstanceTest;
import javaEx.io.Service.InstanceTestBoolean;
import javaEx.io.Service.InstanceTestInteager;
import javaEx.io.Service.InstanceTestString;

public class Main {

	public static void main(String[] args) {
		
//		for(ExEnums exEnums : ExEnums.values()){
//            System.out.println(exEnums.getName());
//        }
		
		
		/*자바 1.8이상 lambda 이용 부분*/
//		ExLambda el = (a,b)->{
//        	return a+b;
//        };
//        System.out.println("값을 확인합니다. : "+ el.run(3, 4));
//        el = (a,b)->{
//        	return a*b;
//        };
//        System.out.println("값을 확인합니다. : "+ el.run(3, 4));
//        el = (a,b)->{
//        	return b-a;
//        };
//        System.out.println("값을 확인합니다. : "+ el.run(3, 4));
		
		/*예외처리 부분*/
//		ExError1 ee1 = new ExError1();
//	    ee1.Errortest();ㅏ
		
		
		/*IO, NIO 파일 이동 부분*/
//		FileTranferControll f = new FileTranferControll();
//		try {
//			f.fileTransfer();
//			f.fileTransfer_useBuffer();
//			f.fileTransferNio();		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/*클래스 관계를 확인하는 부분*/
		InstanceTest its = new InstanceTestString();
		InstanceTest iti = new InstanceTestInteager();
		InstanceTest itb = new InstanceTestBoolean();
		System.out.println(its instanceof InstanceTestString);
		System.out.println(its instanceof InstanceTestInteager);
		System.out.println(its instanceof InstanceTestBoolean);
		System.out.println(its.getClass());
		
		int[] array = {1,2,3,4,5};
		List list = Arrays.asList(array);
		
		System.out.println("test");
		
		
	}
}

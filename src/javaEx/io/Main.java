package javaEx.io;

import java.io.IOException;

import javaEx.io.Service.FileTranferControll;

public class Main {

	public static void main(String[] args) {
		
//		for(ExEnums exEnums : ExEnums.values()){
//            System.out.println(exEnums.getName());
//        }
		
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
		
//		ExError1 ee1 = new ExError1();
//	    ee1.Errortest();
		
		FileTranferControll f = new FileTranferControll();
		try {
//			f.fileTransfer();
//			f.fileTransfer_useBuffer();
			f.fileTransferNio();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

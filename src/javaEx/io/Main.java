package javaEx.io;

import javaEx.io.Service.ExEnums;
import javaEx.io.Service.ExLambda;

public class Main {

	public static void main(String[] args) {
		
//		for(ExEnums exEnums : ExEnums.values()){
//            System.out.println(exEnums.getName());
//        }
		
		ExLambda el = (a,b)->{
        	return a+b;
        };
        System.out.println("값을 확인합니다. : "+ el.run(3, 4));
        el = (a,b)->{
        	return a*b;
        };
        System.out.println("값을 확인합니다. : "+ el.run(3, 4));
        el = (a,b)->{
        	return b-a;
        };
        System.out.println("값을 확인합니다. : "+ el.run(3, 4));
	}
}

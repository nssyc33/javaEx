package javaEx.io.NestClass;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		NestClass nc = new NestClass();
		HashMap hm = new HashMap();
		hm.put("test", "testValue");
		
		System.out.println(nc.test(hm));
		
		BasicClass bc = new BasicClass();
		bc.test(new BasicInterface(){
			public String test() {
				return "test 구현체입니다.";
			}
		});
		
	}

}

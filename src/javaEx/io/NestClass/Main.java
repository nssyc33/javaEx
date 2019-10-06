package javaEx.io.NestClass;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		NestClass nc = new NestClass();
		HashMap hm = new HashMap();
		hm.put("test", "testValue");
		
		System.out.println(nc.test(hm));

	}

}

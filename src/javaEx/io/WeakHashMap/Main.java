package javaEx.io.WeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Main {

	public static void main(String[] arg) {
		HashMap asMap = new HashMap();
		WeakHashMap weakMap = new WeakHashMap();
		HashMap asKey = new HashMap<>();
		HashMap weakKey = new HashMap<>();
		asMap.put(asKey, "value");
		weakMap.put(weakKey, "value");
		System.out.println("길이 확인합니다. : "+asMap.size());
		System.out.println("길이 확인합니다. : "+weakMap.size());
		
		asKey = null;	
		weakKey = null;
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("test");
		}
		System.out.println("길이 확인합니다. : "+asMap.size());
		System.out.println("길이 확인합니다. : "+weakMap.size());
		
	}
}

package javaEx.io.Map;

import java.util.HashMap;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("test");
		TestMain tm = new TestMain();
		tm.mapTest();
	}
	
	private  void mapTest() {
		HashMap asMap1 = new HashMap();
		
		asMap1.put("key1", "values1");
		asMap1.put("key2", "values2");
		asMap1.put("key3", "values3");
		
		HashMap asMap2 = (HashMap)asMap1.clone();
		System.out.println(asMap1.get("key1")+"||"+asMap1.get("key2")+"||"+asMap1.get("key3"));
		System.out.println(asMap2.get("key1")+"||"+asMap2.get("key2")+"||"+asMap2.get("key3"));
		
		HashMap asMapSub = asMap1;
		asMap1.put("key4", "values4");
		System.out.println(asMap1.get("key1")+"||"+asMap1.get("key2")+"||"+asMap1.get("key3")+"||"+asMap1.get("key4"));
		System.out.println(asMap2.get("key1")+"||"+asMap2.get("key2")+"||"+asMap2.get("key3")+"||"+asMap2.get("key4"));
		
		System.out.println(asMap1.get("key1")+"||"+asMap1.get("key2")+"||"+asMap1.get("key3")+"||"+asMap1.get("key4"));
		System.out.println(asMapSub.get("key1")+"||"+asMapSub.get("key2")+"||"+asMapSub.get("key3")+"||"+asMapSub.get("key4"));
		
		
	}
}

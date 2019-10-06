package javaEx.io.NestClass;

import java.util.Map;

public class NestClass {

	public String test(Map map) {
		
		class InnerClass {
			
			public String tested() {
				return (String) map.get("test");
			}
		}
		
		InnerClass ic = new InnerClass();
		return ic.tested();
	}
	
}

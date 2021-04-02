package javaEx.io.MainMethod;

import java.util.Enumeration;
import java.util.Properties;

public class TestMain {
	public static void main(String[] args) {
//		for (String argsStr : args) {
//			System.out.println(argsStr);
//		}
		
		Properties props = System.getProperties();
		Enumeration<Object> enumerator = props.keys();
	    while (enumerator.hasMoreElements()) {
	        Object ele = enumerator.nextElement();
	        String key = ele.toString();
	        System.out.println(key + ": " + System.getProperty(key));
	    }
	}
}

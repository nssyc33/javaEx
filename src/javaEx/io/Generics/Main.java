package javaEx.io.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	
	private static <T,K> void test(T t, K k) {
		System.out.println("test");
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		String[] arrays = new String[] {"test1","test2","test3","test4","test5"};
		
		List<String> asLists = Arrays.asList(arrays);
		
		asLists.forEach((a)->System.out.println(a.toString()));
		
			
		
	}
}

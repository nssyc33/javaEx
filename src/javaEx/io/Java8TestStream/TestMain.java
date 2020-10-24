package javaEx.io.Java8TestStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class TestMain {
	private static final Object[] String = null;

	public static void main(String[] args) {
		TestMain tm = new TestMain();
		tm.test();
		
		
	}
	
	public void test() {
		List list = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,0);
		list = new ArrayList(new HashSet<>(list));
		Stream<Integer> asList = list.stream();
		System.out.println(asList.findAny());
		
		Stream<String> asListStr = Stream.of("test14","test2","test3","test4","test5");
		System.out.println("answer : "+ asListStr.findFirst());
		
		
		
		
	}
}

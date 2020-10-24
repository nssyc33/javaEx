package javaEx.io.Java8Test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestPractice {
	public void test1() {
		BiFunction<Integer, Integer, String> as1 = (t1,t2) -> {
			return String.valueOf(t1) + " ::::: " + String.valueOf(t2) + " ::::: " + "answer ¿‘¥œ¥Ÿ.";
		};
		System.out.println(as1.apply(10, 20));
	}
	
	public void test2() {
		Function<String, String> as2 = (t1) -> {
			t1 = t1.replaceAll("-", "");
			return t1;
		};
		System.out.println(as2.apply("111-22-33333"));
	}
	
	public void test3() {
		Consumer<Integer> as3 = (t1) -> {
			for(int i=1; i< 10; i++) {
				System.out.println(t1 + " X "+ i+ " = " + (t1*i));
			}
		};
		
		for(int i=1; i<10; i++) {
			as3.accept(i);
		}
		
		
		
	}
}
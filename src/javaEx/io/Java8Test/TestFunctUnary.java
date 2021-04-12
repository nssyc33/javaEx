package javaEx.io.Java8Test;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TestFunctUnary {
	public static void main(String[] args) {
		System.out.println("test");
		TestFunctUnary tf = new TestFunctUnary();
		tf.test();
	}
	
	protected void test() {
		Function<Integer, String> fc = (p)-> String.valueOf(p)+" test ¿‘¥œ¥Ÿ.";
		System.out.println(fc.apply(100));
		
		UnaryOperator<Integer> uo = (p)-> p;
		System.out.println(String.valueOf(uo.apply(10)));
		
		
	}

}

package javaEx.io.Exception;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctional {
	public static void main(String[] args) {
		Function<Integer, Integer> plus20 = (i)->i+20; 
		Function<Integer, Integer> multi20 = (i)->i*20;
		
		Function<Integer, Integer> multi20Plus20 = plus20.compose(multi20);
		
		System.out.println(multi20Plus20.apply(10));
		
		Predicate<String> predicate = (aa) -> aa.startsWith("test");
		System.out.println(predicate);
	}	
}

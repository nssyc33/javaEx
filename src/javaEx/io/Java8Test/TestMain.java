package javaEx.io.Java8Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.swing.text.Utilities;

public class TestMain {
	public static void main(String[] args) {
//		System.out.println("test");
//		TestInf t = ()->{
//			System.out.println("testtest");
//		};
//		t.test();
//
//		String [] strings = new String[]{"6", "5", "4", "3", "2", "1"};
//		List<String> list = Arrays.asList(strings);
//
//		list.forEach(System.out::println);
		
		
//		List lists = Arrays.asList("1-1","1-2","1-3","1-4","1-5","1-6","1-7");
//		lists.stream().filter(predicate)

		Runnable r = () -> {
			System.out.println("Runnable test");
		};
		r.run();
		
		Supplier<Integer> sa = ()->{
			return 12345;
		};
		
		System.out.println(sa.get());
		
		
		
		Consumer<String> stringa = (a)->{
			System.out.println("테스트 확인합니다 : "+ a);
		};
		
		stringa.accept("testtest");
		
		
		System.out.println("========================================================");
		TestVo a = new TestVo();
		TestVoSub b = new TestVoSub();
		
		a.setV1("1");
		a.setV2("2");
		a.setV3("3");
		
		b.setV1("1");
		b.setV2("2");
		b.setV3("3");
		
		System.out.println("========================================================");
		
		List aslist = Arrays.asList("test1","test2","test3","test4","test5");

		TestMethodReferance tm = new TestMethodReferance();
		
		Function<String, String> asSS = tm::tests;
		Function<Integer,String> asIS = tm::convertString;
		
		System.out.println("answer : "+asSS.apply("woman"));
		System.out.println("answer : "+asIS.apply(123));
		
 		
		
		
	}

}
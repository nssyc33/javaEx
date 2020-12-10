package javaEx.io.Java8TestStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMain {
	private static final Object[] String = null;

	public static void main(String[] args) {
//		TestMain tm = new TestMain();
//		tm.test();
//		tm.intStreamTest();
		
		new Thread(()-> {
		}).start();
		System.out.println(Thread.currentThread().getClass());
		
		
		List<java.lang.String> as = Arrays.asList("test1","test1","test1","test1");
		List newlist = new ArrayList<>();
		newlist.addAll(as);
		
		newlist.forEach(System.out::println);
		
		int[] intArrays = IntStream.rangeClosed(1, 100).toArray();
		Arrays.stream(intArrays).forEach(System.out::println);
		
		
		
		
		
		
	}
	
	public void test() {
		List list = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,0);
		list = new ArrayList(new HashSet<>(list));
		Stream<Integer> asList = list.stream();
		System.out.println(asList.findAny());
		
		Stream<String> asListStr = Stream.of("test14","test2","test3","test4","test5");
		System.out.println("answer : "+ asListStr.findFirst());
		
	}
	
	public void intStreamTest() {
		List<TestVo> list = new ArrayList<TestVo>();
		IntStream.rangeClosed(1, 100)
				 .forEach(i -> {
					 list.add(new TestVo("name test", "id test", i));
					 
				 });
		list.stream().forEach(System.out::println);
		
	}
	
	
}

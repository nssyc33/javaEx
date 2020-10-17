package javaEx.io.Java8Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class TestCollect {

	public static void main(String[] args) {
		TestCollect a = new TestCollect();
		a.test();
	}
	public void test() {
		List list = Arrays.asList("test1","test2","test3","test4","test5");
		System.out.println(list.toString());
		Iterator as = list.iterator();
		
		
	}
}

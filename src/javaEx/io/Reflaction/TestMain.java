package javaEx.io.Reflaction;

import java.lang.reflect.Method;

public class TestMain {
	public static void main(String[] args) {
		new TestMain().new Test().test();
	}
	
	class Test{
		public void test() {
			try {
	            Class vectorClass = Class.forName("java.util.Vector");
	            Method[] methods = vectorClass.getDeclaredMethods();

	            for (Method method : methods) {
	                System.out.println(method.toString());
	            }

	        } catch (ClassNotFoundException e) {
	            System.out.println("에러가 발생했습니다.");
	        }
		}
	}
}

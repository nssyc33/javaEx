package javaEx.io.Exception;

public class TestMain {
	public static void main(String[] args) {
		Ex1 e1 = new Ex1();
		e1.test();
		
		TestInter ti = () -> {
			System.out.println("testtest");
		};
		
		ti.testFunc();
	}
}
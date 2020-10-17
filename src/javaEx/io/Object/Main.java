package javaEx.io.Object;

public class Main {

	public static void main(String[] args) {
		
		SuperClass s1 = new SuperClass();
		SuperClass s2 = new SubClass();
		
		Test t1 = new Test(s1);
		Test t2 = new Test(s2);
		
		t1.test();
		t2.test();
		
	}
}
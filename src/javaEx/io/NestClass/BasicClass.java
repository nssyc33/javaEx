package javaEx.io.NestClass;

public class BasicClass {

	public void test(BasicInterface basicInterface) {
		
		System.out.println("before");
		System.out.println(basicInterface.test());
		System.out.println("after");
	}
}

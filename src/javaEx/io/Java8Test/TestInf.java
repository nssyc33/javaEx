package javaEx.io.Java8Test;

@FunctionalInterface
public interface TestInf {

	default void deTest() {
		System.out.println("default test");
	}
	
	public void test();
}

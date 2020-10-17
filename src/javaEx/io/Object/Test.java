package javaEx.io.Object;

public class Test {

	SuperClass superClass;
	
	public Test(SuperClass superClass) {
		this.superClass = superClass;
	}
	
	public void test() {
		this.superClass.test();
	}
}

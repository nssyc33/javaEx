package javaEx.io.Exception;

public class Ex1 {

	public void test() {
		Ex2 e2 = new Ex2();
		try {
			e2.test();
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
	}
}

package javaEx.io.JavaPractice;

public class TestStaticVar {
	public static void main(String[] args) {
		TestStaticVar.TestSub tm1 = new TestSub();
		TestStaticVar.TestSub tm2 = new TestSub();
		
		tm1.test1();
		tm1.test3();
		tm1.test2();
		tm2.test3();
		System.out.println("===========================================================");
		
		TestStaticVar.TestThird tm3 = new TestStaticVar().new TestThird();
		TestStaticVar.TestThird tm4 = new TestStaticVar().new TestThird();
		
		tm3.test1();
		tm3.test3();
		tm3.test2();
		tm4.test3();
		
		
	}
	
	static class TestSub{
		public static String asVar;
		
		public void test1() {
			asVar = "test1";
			System.out.println("test");
		}
		
		public void test2() {
			asVar = "test2";
			System.out.println("test");
		}
		
		public void test3() {
			System.out.println("asVar 값은 : "+ asVar);
		}
	}
	
	class TestThird{
		public String asVar;
		
		public void test1() {
			asVar = "test1";
			System.out.println("test");
		}
		
		public void test2() {
			asVar = "test2";
			System.out.println("test");
		}
		
		public void test3() {
			System.out.println("asVar 값은 : "+ asVar);
		}
	}
}

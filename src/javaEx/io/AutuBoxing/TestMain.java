package javaEx.io.AutuBoxing;

public class TestMain {
	public static void main(String[] args) {
		TestMain.Test1 tm = new TestMain().new Test1();
		tm.test1();
		
	}
	
	protected class Test1{
		public void test1() {

			Integer a = 3; // 내부적으로는 Integer a = new Integer(3); 으로 변환하여 동작
			Object o = new Long(3); 
			System.out.println(a ==o);
			System.out.println(a.equals(o));
			
			Integer b = new Integer(3);
			int i = b; //내부적으로 int i = a.intValue(); 로 바뀌어 동작
			
			System.out.println(b ==i);
			System.out.println(b.equals(i));			
			
			
		}
	}
}

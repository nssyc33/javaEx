package javaEx.io.AutuBoxing;

public class TestMain {
	public static void main(String[] args) {
		TestMain.Test1 tm = new TestMain().new Test1();
		tm.test1();
		
	}
	
	protected class Test1{
		public void test1() {

			Integer a = 3; // ���������δ� Integer a = new Integer(3); ���� ��ȯ�Ͽ� ����
			Object o = new Long(3); 
			System.out.println(a ==o);
			System.out.println(a.equals(o));
			
			Integer b = new Integer(3);
			int i = b; //���������� int i = a.intValue(); �� �ٲ�� ����
			
			System.out.println(b ==i);
			System.out.println(b.equals(i));			
			
			
		}
	}
}

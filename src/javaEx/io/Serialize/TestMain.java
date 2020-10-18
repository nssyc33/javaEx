package javaEx.io.Serialize;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class TestMain {
	public static void main(String[] args) throws Exception{
		TestMain tm = new TestMain();
		tm.test();
	}
	
	public void test() throws Exception {
		/*serializing*/
		TestVo vo = new TestVo("test1","test2","test3");
		/*not serializing*/
		TestUsVo voUs = new TestUsVo("testUs1","testUs2","testUs3");
		
		
		//--> ����ȭ �ǽ�
		byte[] serializedMember;
	    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
	            oos.writeObject(vo);
	            // serializedMember -> ����ȭ�� member ��ü
	            serializedMember = baos.toByteArray();
	        }
	    }
	    // ����Ʈ �迭�� ������ ����ȭ �����͸� base64�� ��ȯ
	    System.out.println(Base64.getEncoder().encodeToString(serializedMember));
		
		
		
	}
}

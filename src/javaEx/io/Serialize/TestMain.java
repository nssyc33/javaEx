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
		
		
		//--> 직렬화 실시
		byte[] serializedMember;
	    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
	            oos.writeObject(vo);
	            // serializedMember -> 직렬화된 member 객체
	            serializedMember = baos.toByteArray();
	        }
	    }
	    // 바이트 배열로 생성된 직렬화 데이터를 base64로 변환
	    System.out.println(Base64.getEncoder().encodeToString(serializedMember));
		
		
		
	}
}

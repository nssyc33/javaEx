package javaEx.io.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
	public static void main(String[] args) {
		TestMain.Test1 tm = new TestMain().new Test1();
		tm.test_basic();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		tm.test_basic_sub();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		tm.test_good_sample();
	}
	
	class Test1{
		public void test_basic() {
			String str = "1234567890";
			String exp1 = "^[0-9]*$";
			String exp2 = "^[\\d]*$";
			
			Pattern p1 = Pattern.compile(exp1);
			Pattern p2 = Pattern.compile(exp2);
			Matcher m1 = p1.matcher(str);
			Matcher m2 = p2.matcher(str);
			System.out.println(m1.find());
			System.out.println(m2.find());
			
		}
		
		public void test_basic_sub() {
			String str = "1234567890#";
			String exp1 = "^[0-9]*$";
			
			if(!str.matches(exp1)) {
				System.out.println("값을 숫자만 입력해 주시기 바랍니다.");
			}
		}
		public void test_good_sample() {
			String targetMail = "test@test.com/test@dfa.net/tttt@cos.com";
			String regex = "([\\w]+@[\\w]+.com)";
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(targetMail); 
			while(m.find()) {
				System.out.println(m.group());
			}
			
		}
	}
	
}

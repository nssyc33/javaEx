package javaEx.io.Stack;

import java.util.Stack;

public class TestMain {
	public static void main(String[] args) {
		TestMain tm = new TestMain();
		Stack stack = tm.getStack();
//		System.out.println(stack);
		
		StackVo vos1 = (StackVo)stack.pop();
		System.out.println(vos1.toString()+stack.isEmpty()+"||"+stack.capacity());
		StackVo vos2 = (StackVo)stack.pop();
		System.out.println(vos2.toString()+stack.isEmpty()+"||"+stack.capacity());
		StackVo vos3 = (StackVo)stack.pop();
		System.out.println(vos3.toString()+stack.isEmpty()+"||"+stack.capacity());
		StackVo vos4 = (StackVo)stack.pop();
		System.out.println(vos4.toString()+stack.isEmpty()+"||"+stack.capacity());
		StackVo vos5 = (StackVo)stack.pop();
		System.out.println(vos5.toString()+stack.isEmpty()+"||"+stack.capacity());
		
	}
	
	protected Stack getStack() {
		StackMain st = new StackMain();
		return st.datacontroll();
	}
	

}

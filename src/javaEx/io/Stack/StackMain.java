package javaEx.io.Stack;

import java.util.Stack;

public class StackMain {

	protected Stack datacontroll() {
		Stack stack = new Stack<>();
		for(int i=0; i<5; i++) {
			StackVo vo = new StackVo();
			vo.setTest1(String.valueOf(i));
			vo.setTest2(String.valueOf(i));
			vo.setTest3(String.valueOf(i));
			stack.push(vo);
		}
		return stack;
	}
}

package javaEx.io.List;

import java.util.LinkedList;
import java.util.List;

public class TestClass {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		List<LargeVo> list = tc.setList();
		System.out.println(list.get(3).getVar1());
		LargeVo vo = new LargeVo();
		vo.setVar1("test11");
		vo.setVar2("test22");
		vo.setVar3("test33");
		vo.setVar4("test44");
		vo.setVar5("test55");
		list.set(3, vo);
		System.out.println(list.get(3).getVar1());
		
	}
	
	private List setList() {
		List<LargeVo> list = new LinkedList<>();
		for(int i = 0; i < 4; i++) {
			LargeVo vo = new LargeVo();
			vo.setVar1("test1");
			vo.setVar2("test2");
			vo.setVar3("test3");
			vo.setVar4("test4");
			vo.setVar5("test5");
			list.add(vo);
		}
		
		return list;
	}
}

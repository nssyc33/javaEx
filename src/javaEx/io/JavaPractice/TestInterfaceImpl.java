package javaEx.io.JavaPractice;

import java.util.function.IntConsumer;

public class TestInterfaceImpl implements TestInterface1, TestInterface2{
	@Override
	public void testa() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void testb() {
		// TODO Auto-generated method stub
		IntConsumer a = new IntConsumer() {
			
			@Override
			public void accept(int value) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}

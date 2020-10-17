package javaEx.io.Java8Test;

import java.util.function.Supplier;

public class SupplierClass {

	public static void main(String[] args) {
		SupplierClass sc = new SupplierClass();
		sc.supplierTest();
	}
	
	protected void supplierTest() {
		Supplier<String> sp = () -> "test";
		System.out.println(sp.get());
		
		
	}
}

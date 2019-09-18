package javaEx.io.AdapterPattern;

public class Mains {

	public static void main(String[] args) {
		Gun g36 = new G36Impl();
		Gun m16 = new M16Impl();
		System.out.println(g36.fire());
		System.out.println(m16.fire());
	}

}

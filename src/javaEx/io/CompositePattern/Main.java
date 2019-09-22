package javaEx.io.CompositePattern;

public class Main {

	public static void main(String[] arg) {
		Gun m16 = new M16();
		Gun g36 = new G36();
		Gun m4 = new M4();
		
		m16.fire();
		g36.fire();
		m4.fire();
		
		Guns guns = new Guns();
		guns.addinList(m16);
		guns.addinList(g36);
		guns.addinList(m4);
		System.out.println("everything fire!!!!!");
		guns.fire();
	}
}

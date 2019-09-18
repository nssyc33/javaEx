package javaEx.io.AdapterPattern;

public class M16Impl implements Gun{

	
	@Override
	public String fire() {
		M16 m16 = new M16();
		return m16.shoot();
	}
}

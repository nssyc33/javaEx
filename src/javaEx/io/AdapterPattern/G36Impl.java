package javaEx.io.AdapterPattern;

public class G36Impl implements Gun{

	
	
	@Override
	public String fire() {
		G36 g36 = new G36();
		return g36.shoot();
	}
}

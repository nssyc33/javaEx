package javaEx.io.CompositePattern;

import java.util.ArrayList;

public class Guns implements Gun{
	
	public ArrayList<Gun> guns = new ArrayList<Gun>();
	
	@Override
	public void fire() {
		for(Gun gun: guns) {
			gun.fire();
		}
	}
	
	public void addinList(Gun gun) {
		this.guns.add(gun);
	}
	
	public void clear() {
		this.guns.clear();
	}

}

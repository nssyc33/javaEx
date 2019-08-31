package javaEx.io.Service;

public enum ExEnums {
	A("°¡"),
	B("³ª"),
	C("´Ù");
	
	private final String name;

	private ExEnums(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

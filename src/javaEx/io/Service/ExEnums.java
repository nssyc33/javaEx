package javaEx.io.Service;

public enum ExEnums {
	A("��"),
	B("��"),
	C("��");
	
	private final String name;

	private ExEnums(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

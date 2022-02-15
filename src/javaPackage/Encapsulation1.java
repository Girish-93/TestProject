package javaPackage;

public class Encapsulation1 {

	// Later Will change the scope of private variable as public
	private String name;

	public void setName(String a) {
		this.name = a;
	}

	// Changing Variable scope from private to public
	public Object getName() {

		return name;

	}

}

package day21;

public class StringDemo3 {

	String name;

	public StringDemo3(String nam) {
		this.name = nam;

	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {

		String name = new String("Ram");
		System.out.println(name);
		System.out.println(name.toString());

		StringDemo3 obj = new StringDemo3("Ram");
		System.out.println(obj);
		System.out.println(obj.toString());
	}

}

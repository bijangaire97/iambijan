package day22;

public class StringDemo8 {
	public static boolean isTrue(String s) {

		return s.matches("True|true");

	}

	public static boolean isEmail(String s) {

		return s.matches("^(.+)@(.+)$");

	}

	public static void main(String[] args) {
		System.out.println(isTrue("True"));
		System.out.println(isTrue("true"));
		System.out.println(isEmail("abc@gmail"));

	}

}

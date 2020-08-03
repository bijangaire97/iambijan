package day22;

public class StringDemo4 {

	public static void main(String[] args) {

		String s1 = "Good morning";
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(0, 4));
		System.out.println(s1.charAt(3));
		System.out.println(s1.contains("r"));
		System.out.println(s1.length());
		System.out.println(s1.isBlank());
		System.out.println(s1.concat(" Hello"));
		System.out.println("Hello ".concat(s1));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

		char[] ch = s1.toCharArray();
		System.out.println(ch[1]);

		System.out.println(s1.replace("morning", "Evening"));

		System.out.println(s1.compareTo("Good"));

	}

}

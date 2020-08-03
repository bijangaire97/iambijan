package day22;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s1 = "Good";
		s1 = s1.concat(" morning");

		System.out.println(s1);

		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);

		}
		System.out.println(rev);

		System.out.println("-------------");

		StringBuilder sb = new StringBuilder("Good");
		System.out.println(sb);
		sb.append(" morning");
		System.out.println(sb);

		System.out.println(sb.reverse());
		System.out.println(sb.delete(0, 5));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(0, 5));

	}

}

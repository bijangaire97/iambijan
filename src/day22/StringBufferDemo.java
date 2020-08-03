package day22;

public class StringBufferDemo {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Good");
		System.out.println(sb);
		sb.append(" morning");
		System.out.println(sb);

		System.out.println(sb.reverse());
		System.out.println(sb.delete(0, 5));
	}
}

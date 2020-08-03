package day21;

public class StringDemo1 {

	public static void main(String[] args) {

		String s1 = "Hello";
		System.out.println(s1);

		String s2 = new String();
		System.out.println(s2);

		String s3 = new String("Apple");
		System.out.println(s3);

		char[] sen = { 'a', 'b', 'c' };
		String s4 = new String(sen);
		System.out.println(s4);

		byte[] bb = { 65, 66, 67 };
		String s5 = new String(bb);
		System.out.println(s5);

	}

}

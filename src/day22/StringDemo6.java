package day22;

public class StringDemo6 {

	public static void main(String[] args) {
		String intro = "I am Bijan Gaire,. I am a Biomedical Engineer, learning programming, to get job, and secure my future, atleast.";

		String[] words = intro.split(" ");

		for (String s : words) {
			System.out.println(s);
		}

		String[] a = intro.split(",");

		for (String b : a) {
			System.out.println(b);
		}

	}

}

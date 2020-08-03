package day22;

import java.util.StringTokenizer;

public class StringDemo7 {

	public static void main(String[] args) {
		String intro = "I am Bijan Gaire,,. I am a Biomedical Engineer,, learning programming, to get job, and secure my future, atleast.";

		String[] words = intro.split(",");
		System.out.println(words.length);

		for (String s : words) {
			System.out.println(s);
		}
		StringTokenizer st = null;
		st = new StringTokenizer(intro, ",");

		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}

	}

}

package day22;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String a = "Hello, my name is Bijan. I am a Biomedical Engineer by degree.";

		StringTokenizer st = new StringTokenizer("Hello, my name is Bijan. I am a Biomedical Engineer by degree.");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		st = new StringTokenizer(a, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}
}
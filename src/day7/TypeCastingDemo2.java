package day7;

public class TypeCastingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 97;
		System.out.println(c1);
		
		char c2 = 'a';
		short s2 = 'a';
		System.out.println(c2);
		System.out.println(s2);
		
		char c3 = 65; 
		short s3 = (short) c3; // forceful conversion
		
		System.out.println(c3);
		System.out.println(s3);

	}

}

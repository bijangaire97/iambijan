package day7;

public class TypeCastingDemo1 {
public static void main(String[] args) {
	// implicit casting 
	//by compiler
	byte b = 127;
	int i = b;
	System.out.println("b is: "+ b);
	System.out.println("i is: "+ i);
	
	
	//explicit casting
	//by programmer
	int ii= 127;
	byte bb = (byte)ii;  //thulo bata sano size ma lana mildaina.... range bahira chha bhanye garbage value aaucha
	System.out.println("ii is: "+ ii);
	System.out.println("bb is: "+ bb);
	
}
}

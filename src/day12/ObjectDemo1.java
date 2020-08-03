package day12;

public class ObjectDemo1 {
	
	public void greet() {
		
		System.out.println("Hello USA!!!!");
	}
	

	public static void main(String[] args) {
		
		ObjectDemo1 obj = new ObjectDemo1(); // ways to make classes
		
		ObjectDemo1 obj1;
		obj1 = new ObjectDemo1();
		
		new ObjectDemo1();  //ways to make object
		
		obj.greet();
		obj1.greet();
		new ObjectDemo1().greet();
		
		

	}

}

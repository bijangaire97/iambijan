package day20;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setName("ram");
		student1.setRoll(11);
		System.out.println(student1.getName());
		System.out.println(student1.getRoll());

		Student student2 = new Student();
		student2.setName("sam");
		student2.setRoll(13);
		System.out.println(student2.getName());
		System.out.println(student2.getRoll());

	}

}

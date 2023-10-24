package student;
import java.util.Scanner;
public class StudentInterface {
	
	public static void main(String a []) {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("First Name: " );
		student.setfirstName(sc.nextLine());
		System.out.println("Middle Name: ");
		student.setmiddleName(sc.nextLine());
		System.out.println("Last Name: "); 
		student.setlastName(sc.nextLine());
		System.out.println("Suffix: ");
		student.setsuffix(sc.nextLine());
		
		System.out.println(student.getfirstName());
		System.out.println(student.getmiddleName());
		System.out.println(student.getlastName());
		System.out.println(student.getsuffix());
		System.out.println(student.getfullName());
		
	}
	
}

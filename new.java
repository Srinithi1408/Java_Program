import java.util.Scanner;
public class FirstName {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String name=sc.next();
			String job=sc.next();
			int phone=sc.nextInt();
			int salary=sc.nextInt();
			System.out.println("Name:"+name);
			System.out.println("Phone Number:"+phone);
			System.out.println("Possition:"+job);
			System.out.println("Salary:"+salary);
		}
		
		
	}

}

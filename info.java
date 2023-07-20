import java.util.Scanner;
class information {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);{
		String  name=sc.nextLine();
		String Class=sc.next();
		int roll=sc.nextInt();
		int age=sc.nextInt();
		int weight=sc.nextInt();
		System.out.println("|------------------------");
		System.out.println("|\tName       :"+name);
		System.out.println("|\tClass      :"+Class);
		System.out.println("|\tExam Number:"+roll);
		System.out.println("|\tAge        :"+age);
		System.out.println("|\tWeight     :"+weight);
		System.out.println("|------------------------");
	}
	
	}
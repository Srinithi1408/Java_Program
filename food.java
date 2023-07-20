import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Item");
		int a=sc.nextInt();
		switch(a){
		    case 1:System.out.println(a+" Parotta");
		    break;
		    case 2:System.out.print(a+" Biriyani");
		    break;
		    case 3:System.out.println(a+" Fried rice");
		    break;
		    case 4:System.out.print(a+" chappathai");
		    break;
		    case 5:System.out.println(a+" poori");   
		    break;
		    case 6:System.out.print(a+" Dosai");
		    break;
		}
	}
}


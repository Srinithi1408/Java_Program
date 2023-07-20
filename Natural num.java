import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
		if(a>0)
		{
		    System.out.println("The given Number is Natural Number");
		}
		else{
		    System.out.println("The given Number is not a Natural Number");
		}
	}
}

import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		double a=sc.nextDouble();
		if (a>=0)
		{
		    System.out.println (Math.sqrt(a)+"The given Number is Square = ");
		}
		else{
		    System.out.println ("Enter Positive Number");
		}
	}
}
		
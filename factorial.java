import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int a=sc.nextInt();
		int f=1;
		for( int i=1;i<=a;i++)
		f*=i;
		System.out.println(f);
	}}
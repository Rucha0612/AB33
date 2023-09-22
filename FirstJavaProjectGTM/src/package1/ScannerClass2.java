package package1;
import java.util.Scanner;
public class ScannerClass2 
{
	static void add()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		int c = a+b;
		System.out.println("Addition of two values = ");
		System.out.println(c);
	}
	static void sub()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		int c = a-b;
		System.out.println("Subtraction of two values = ");
		System.out.println(c);
	}
	static void multiply()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		int c = a*b;
		System.out.println("Multiplication of two values = ");
		System.out.println(c);
	}
	static void division()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		int c = a/b;
		System.out.println("Division of two values = ");
		System.out.println(c);
	}
	

	public static void main(String[] args) 
	{
		add();
		sub();
		multiply();
		division();

	}

}

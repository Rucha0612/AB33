package package1;
import java.util.Scanner;
public class ScannerClass1
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		// String name = s1.next();
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		int c = a+b;
		System.out.println("addition of two values = ");
		System.out.println(c);
		int d = a-b;
		System.out.println("addition of two values = ");
		System.out.println(d);
		int e = a*b;
		System.out.println("addition of two values = ");
		System.out.println(e);
		int f = a/b;
		System.out.println("addition of two values = ");
		System.out.println(f);
		s1.close();
	}
}

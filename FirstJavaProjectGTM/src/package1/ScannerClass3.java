package package1;

import java.util.Scanner;

public class ScannerClass3 
{

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
        int a = s1.nextInt();
        System.out.println("Enter value of b");
        double b = s1.nextDouble();
        double c = a+b;
        System.out.println("addition of two values = ");
        System.out.println(c);
	}

}

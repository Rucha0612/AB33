package package1;
import java.util.Scanner;
public class ScannerClass4 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
        int a = s1.nextInt();
        System.out.println("Enter value of b");
        byte b = s1.nextByte();
        System.out.println("Enter value of c");
        short c = s1.nextShort();
        System.out.println("Enter value of d");
        long d = s1.nextLong();
        System.out.println("Enter your name ");
        String name = s1.next();
        System.out.println("Enter true or false =  ");
        boolean e = s1.nextBoolean();
        System.out.println("Enter float value  ");
        float f = s1.nextFloat();
        System.out.println("Enter decimal value  ");
        double g = s1.nextDouble();
        s1.close();
	}

}

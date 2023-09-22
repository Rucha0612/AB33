package package1;
import java.util.Scanner;
public class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		System.out.println("Enter value of b");
		System.out.println("Enter value of c");
		
		int a = s1.nextInt();
		switch(a)
		{
		case 1:System.out.println("thanks for entering value of a");
		break;
		case 2:System.out.println("thanks for entering value of b");
		break;
		case 3:System.out.println("thanks for entering value of c");
		break;
		default:System.out.println("error");
		}
	}
}

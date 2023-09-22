package package1;

public class StringFunction1 
{
	public static void main(String[] args) 
	{
		String a = "India";
		System.out.println(a.length()); //o/p = 5
		
		System.out.println(a.charAt(1)); // o/p = n
		
		System.out.println(a.indexOf('d')); // o/p = 2
		
		System.out.println(a.substring(1)); //o/p = ndia
		
		System.out.println(a.substring(1, 3)); //o/p = ndi
		
		for (int i = 0;i<a.length();i++)
		{ 
		System.out.println(a.charAt(i)); //println used
		}
		for (int i = 0;i<a.length();i++)
		{ 
		System.out.print(a.charAt(i)); //print used
		}
	}
}

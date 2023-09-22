package package1;
public class StringFunction4 
{
	public static void main(String[] args) 
	{
		String a = "MKT"; //o/p = m k t in separate line
		System.out.println(a.toLowerCase().charAt(0));
		System.out.println(a.toLowerCase().charAt(1));
		System.out.println(a.toLowerCase().charAt(2));
		
		String a1 = "MY NAME IS RUCHA"; //o/p = My Name Is Rucha
		System.out.print(a1.toUpperCase().charAt(0));
		System.out.print(a1.toLowerCase().charAt(1));
		System.out.print(a1.toLowerCase().charAt(2));
		System.out.print(a1.toUpperCase().charAt(3));
		System.out.print(a1.toLowerCase().substring(4, 7));
		System.out.print(a1.toLowerCase().charAt(7));
		System.out.print(a1.toUpperCase().charAt(8));
		System.out.print(a1.toLowerCase().substring(9,10));
		System.out.print(a1.toLowerCase().charAt(10));
		System.out.print(a1.toUpperCase().charAt(11));
		System.out.print(a1.toLowerCase().substring(12));
	}
}

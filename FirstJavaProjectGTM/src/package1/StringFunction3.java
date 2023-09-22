package package1;
public class StringFunction3 
{
	public static void main(String[] args) 
	{
	String a = "My Name Is Rucha";
	System.out.println(a.trim());
	String a1 = "      My Name Is    Rucha     ";
	System.out.println(a1.trim());
	String a2 = "";
	System.out.println(a2.isEmpty());
	String a3 = "My Name Is Rucha";
	System.out.println(a3.isEmpty());
	String a4 = "Rucha";
	String a5 = "Vaidya";
	System.out.println(a4.concat(a5));
	System.out.println(a4.concat(" ").concat(a5));
	System.out.println(a4.toUpperCase());
	System.out.println(a5.toLowerCase());
	System.out.println(a4.contains("R"));
	System.out.println(a5.matches(a4));
	System.out.println(a4.equals(a));
	System.out.println(a3.lastIndexOf('a'));
	}
}
//switch to frame function

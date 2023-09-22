package package1;

public class StringFunction2 
{

	public static void main(String[] args) 
	{
		String a = "India";
		System.out.println(a.length()); //o/p = 5
		System.out.println(a.charAt(1)); // o/p = n
		System.out.println(a.indexOf('d')); // o/p = 2
		System.out.println(a.substring(1)); //o/p = ndia
		System.out.println(a.substring(1, 3)); //o/p = ndi
		/* o/p = I
		         N
		         D
		         I
		         A*/
		for (int i = 0;i<a.length();i++)
		{ 
		System.out.println(a.charAt(i)); //println used
		}
		 
		/* o/p =  My 
                  Name
                  Is
                  Rucha*/
		String a1 = "My Name Is Rucha";
		System.out.println(a1.substring(0,2)); 
		System.out.println(a1.substring(3,7)); 
		System.out.println(a1.substring(8,10)); 
		System.out.println(a1.substring(11)); 
		
		/* o/p =  Rucha 
		          Is
		          Name
		          My*/
		System.out.println(a1.substring(11)); 
		System.out.println(a1.substring(8,10)); 
		System.out.println(a1.substring(3,7)); 
		System.out.println(a1.substring(0,2)); 
		
		//o/p = Rucha Is Name My
		System.out.print(a1.substring(10));
		System.out.print(" ");
		System.out.print(a1.substring(8,10));
		System.out.print(" ");
		System.out.print(a1.substring(3,7));
		System.out.print(" ");
		System.out.print(a1.substring(0,2));
		
		// o/p = ahcuR sI emaN yM
		String input = "My Name Is Rucha";
		String output = " ";
		for(int i=input.length()-1;i>=0;i--)
		{
			output = output + input.charAt(i);
			System.out.println("");
			System.out.println(output);
		}

	}

}

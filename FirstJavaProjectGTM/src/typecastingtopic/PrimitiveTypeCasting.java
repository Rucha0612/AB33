package typecastingtopic;

public class PrimitiveTypeCasting 
{

	public static void main(String[] args) 
	{
		//covert int data type to double data type = widening (By Both Implicitly and explicitly)
		
		int wt = 85;
		double wt1 = 85; //widening implicitly
		double wt2 = (double)wt; //widening explicitly
		System.out.println(wt1);
		System.out.println(wt2);
		
		//covert double data type to int data type = narrowing (Only explicitly)
		
		double wt3 = 85.67;
		int wt4 = (int)wt3; //narrowing explicitly only
		System.out.println(wt4);
		

	}

}

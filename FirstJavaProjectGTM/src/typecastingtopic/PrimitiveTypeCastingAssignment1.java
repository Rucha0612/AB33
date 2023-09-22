package typecastingtopic;

public class PrimitiveTypeCastingAssignment1 
{
	public static void main(String[] args) 
	{
		//covert byte data type to long data type = widening (By Both Implicitly and explicitly)
		byte wt = 70;
		long wt1 = 70; //Widening = Implicitly
		long wt2 = (long)wt;//Widening = Explicitly
		System.out.println(wt1);
		System.out.println(wt2);
		
		//covert long data type to byte data type = narrowing (Only explicitly)
		long wt3 = 75;
		byte wt4 = (byte)wt3;//Narrowing = only explicitly
		System.out.println(wt4);
	}
}

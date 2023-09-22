package package1;
public class Math_Class 
{
	public static void main(String[] args) 
	{
		System.out.println(Math.PI);
		System.out.println(Math.addExact(90, 10));
		System.out.println(Math.subtractExact(100, 10));
		System.out.println(Math.subtractExact(98, 100));
		System.out.println(Math.E);
		for(int i=0;i<=3;i++)
		{
		System.out.println(Math.random()); //random method always gives us unique value between 0 to 1 only
	    }
	}
}

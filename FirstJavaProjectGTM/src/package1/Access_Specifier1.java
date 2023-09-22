package package1;

public class Access_Specifier1 
{
	public static void add()
	{
		System.out.println("Add");
	}
	protected static void sub()
	{
		System.out.println("Sub");
	}
	private void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		Access_Specifier1 a1 = new Access_Specifier1();
		a1.mul();
		a1.div();
		
	}

}

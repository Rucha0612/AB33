package package1;

public class Continue_Keyward 
{
	public static void main(String[] args) 
	{
		//continue keyward used to skip the iteration
		int i;
		for(i=0;i<6;i++)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}

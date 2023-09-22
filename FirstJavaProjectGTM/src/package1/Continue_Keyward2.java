package package1;
public class Continue_Keyward2 
{
	public static void main(String[] args) 
	{
		//continue keyward used to skip the iteration
				int i;
				for(i=1;i<=50;i++)
				{
					if(i==49)
					{
						continue;
					}
					System.out.println(i);
				}
	}
}
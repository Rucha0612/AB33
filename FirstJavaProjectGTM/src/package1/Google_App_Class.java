package package1;
abstract class Authentication
{
	abstract void username();
}
public class Google_App_Class extends Authentication
{

	public static void main(String[] args) 
	{
		Google_App_Class g1 = new Google_App_Class();
		g1.username();

	}

	void username()
	{
		
		System.out.println("Please enter username");
	}

}

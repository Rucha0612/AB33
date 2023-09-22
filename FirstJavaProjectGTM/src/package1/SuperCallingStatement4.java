package package1;

class Country1 extends NationalHighway
{
	Country1(String nameofcountry)
	{
		// super(); this statement is present here even if you don't write it
		System.out.println("Bharat");
	}
}
class State1 extends Country1
{
	State1(String nameofstate)
	{
		super("INDIA");
		System.out.println("Maharashtra");
	}
}
class NationalHighway
{
	NationalHighway()
	{
		System.out.println("NH");
	}
}
public class SuperCallingStatement4 
{
	public static void main(String[] args) 
	{
		new State1("MH");
	}

}

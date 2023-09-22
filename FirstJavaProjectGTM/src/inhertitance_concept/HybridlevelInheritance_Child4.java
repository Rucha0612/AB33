package inhertitance_concept;

class child2
{
	static void grandparent()
{
	System.out.println("I am Grand Parent");
}
}
class child3 extends child2
{
	static void parent()
{
	System.out.println("I am Parent");
}
}

public class HybridlevelInheritance_Child4 extends child3
{
	static void child()
	{
		System.out.println("I am child4");
	}
public static void main(String[] args)

{
	grandparent();
	parent();
	child();
}


}

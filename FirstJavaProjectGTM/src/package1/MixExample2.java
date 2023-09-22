package package1;
class Grand_Parent
{
	Grand_Parent()
	{
		System.out.println("it is a grand parent constructor");
	}
	Grand_Parent(int a)
	{
		this();
		System.out.println("it is a grand parent constructor with 1 parameters");
	}
}
class Parent extends Grand_Parent
{
	int a;
	int b;
	Parent()
	{
		this(10);
		System.out.println("it is a parent constructor with no parameters");
	}
	Parent(int a)
	{
		this(10,20);
		System.out.println("it is a parent constructor with 1 parameters");
	}
	Parent(int a, int b)
	{
		super(10);
		System.out.println("it is a parent constructor with 2 parameters");
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
}
public class MixExample2 extends Parent
{
	MixExample2()
	{
		System.out.println("it is child constructor");
	}
	public static void main(String[] args) 
	{
		 new MixExample2();
	}
}
package hierarchical_inhertitance_concept;

public class testcase1 extends Precondition
{
 static void search()
 {
	 System.out.println("search application");
 }
 void addtocart()
 {
	 System.out.println("add item to cart");
 }
 void buy()
 {
	 System.out.println("buy item");
 }
	public static void main(String[] args) 
	{
		testcase1 t1 = new testcase1();
		t1.launch();
		search();
		t1.addtocart();
		t1.buy();
		t1.quit();
	}

}

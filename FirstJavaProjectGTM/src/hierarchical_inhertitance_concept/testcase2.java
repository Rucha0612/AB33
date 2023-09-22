package hierarchical_inhertitance_concept;

public class testcase2 extends Precondition
{
	static void search()
	 {
		 System.out.println("search application");
	 }
	 void wishlist()
	 {
		 System.out.println("add item to wishlist");
	 }
	 void goback()
	 {
		 System.out.println("go back");
	 }
	public static void main(String[] args) 
	{
		testcase2 t2 = new testcase2();
		t2.launch();
		search();
		t2.wishlist();
		t2.goback();
		t2.quit();

	}

}

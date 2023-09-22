package hierarchical_inhertitance_concept;

public class testcase3 extends Precondition
{
	static void search()
	 {
		 System.out.println("search item");
	 }
	 void click()
	 {
		 System.out.println("click item");
	 }
	 void open()
	 {
		 System.out.println("open item");
	 }
	public static void main(String[] args) 
	{
		testcase3 t3 = new testcase3();
		t3.launch();
		search();
		t3.click();
		t3.open();
		t3.quit();
		
	}

}

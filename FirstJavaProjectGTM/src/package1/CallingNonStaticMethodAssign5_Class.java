package package1;

public class CallingNonStaticMethodAssign5_Class {

		
		void add()
		{
			System.out.println("I am adding");
		}
		void sub()
		{
			System.out.println("I am subtracting");
		}
		void multiply()
		{
			System.out.println("I am multiplying");
		}
		void division()
		{
			System.out.println("I am dividing");
		}

		public static void main(String[] args) {
			
			CallingNonStaticMethodAssign5_Class a = new CallingNonStaticMethodAssign5_Class();
			a.add();
			a.sub();
			a.multiply();
			a.division();
			
		}

}

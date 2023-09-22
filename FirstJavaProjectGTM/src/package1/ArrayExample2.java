package package1;

public class ArrayExample2 {

	public static void main(String[] args) 
	{
		String name[]=new String[3];
		name[0]="Ram";
		name[1]="Vishnu";
		name[2]="Bhim";
		int age[]=new int[3];
		age[0]=51;
		age[1]=67;
		age[2]=14;
		double salary[]=new double[3];
		salary[0]=25000;
		salary[1]=23000;
		salary[2]=22000;
		
		
		for (int i = 0;i<=2;i++)
		{
			System.out.println(name[i]);
		    for (int j = i;j<=i;j++)
		  {
			System.out.println(age[j]);
		      for (int k= j;k<=j;k++)
		   {
			System.out.println(salary[k]);
		   }

	       }
		}
		/*for(int i = 0; i<=2; i++)
		{
		 if(i<=2)
		 {
			 System.out.println(name[i]);
		 }
		 if(i<=2)
		 {
			 System.out.println(age[i]);
		 }
		 if(i<=2)
		 {
			 System.out.println(salary[i]);
		 }
		}*/
	}

}

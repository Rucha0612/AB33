package package1;
public class ArrayExample4 {
	public static void main(String[] args) 
	{
		String name[]=new String[3];
		name[0]="Ram";
		name[1]="Vishnu";
		name[2]="Bhim";
		int age[]=new int[3];
		age[0]=51;
		age[1]=93;
		age[2]=11;
		double salary[]=new double[3];
		salary[0]=143.25;
		salary[1]=265.63;
		salary[2]=11.7;
		for(int i = 0; i<=2; i++)
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
		}
	}
}

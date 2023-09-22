package collections_class;

import java.util.Collections;
import java.util.Vector;

public class Collections_VectorClass_AddMethod 
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add("Ram");
		v1.add("Laxman");
		v1.add("Seeta");
		v1.add("Abhishekh");
		v1.add("Abhishekh");
		v1.add(null);
		Collections.sort(v1);
		v1.add(12);
		System.out.println(v1);
	}

}

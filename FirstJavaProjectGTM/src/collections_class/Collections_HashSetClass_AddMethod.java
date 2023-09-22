package collections_class;

import java.util.Collections;
import java.util.HashSet;

public class Collections_HashSetClass_AddMethod 
{

	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add("Laxman");
		h1.add("Ram");
		h1.add("Seeta");
		h1.add("Geeta");
		h1.add("Sita");
		h1.add(6);
		//h1.add(null);
		//Collections.sort(h1);
		System.out.println(h1);

	}

}

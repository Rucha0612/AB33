package collections_class;

import java.util.Collections;
import java.util.LinkedList;

public class Collections_LinkedListClass_AddMethod {

	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add("Laxman");
		l1.add("Ram");
		l1.add("Seeta");
		l1.add("Laxman");
		l1.add(null);
		l1.add(12);
		l1.add(20);
		//Collections.sort(l1);
		System.out.println(l1);
		

	}

}

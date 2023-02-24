package com.xworkz.collection.basiccollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
	public static void main(String[] args) {

		Collection list = new ArrayList();
		list.add(9590099392l);
		list.add(8105768150l);
		list.add(9590099393l);
		list.add(1081057681l);
		list.add(9590099292l);
		list.add(9590098978l);
		list.add(8105765158l);
		list.add(9590099393l);
		list.add(7975008877l);
		list.add(1234567890l);

		System.out.println("Total List: " + list);
		System.out.println("Size of an Array is : " + list.size());

		System.out.println("after adding one more Number are bellow");
		System.out.println(list.add(123456782l) + "" + list);

		System.out.println("finding the value :");
		System.out.println(list.contains(9590099393l)); // finding the value

		System.out.println(list.equals(959009393l));
		System.out.println(list.remove(8105765158l));
		System.out.println("After removing values: " + list);
		System.out.println(list.isEmpty());

		// String array
		Collection ref = new ArrayList();
		ref.add("Vishal");
		ref.add("Vinu");
		ref.add("Vinod");
		ref.add("Raju");
		ref.add("Ravi");
		ref.add("Ankit");
		ref.add("Rajesh");
		ref.add("Kiran");
		ref.add("Radha");
		ref.add("Amar");
		System.out.println(ref);
		System.out.println(ref.size());

		System.out.println("finding the values" + " : " + ref.contains("Vishal"));
		System.out.println(ref.equals("Vishal"));
		System.out.println(ref.add("Anusha"));
		System.out.println(ref);
		System.out.println(ref.remove("Ravi"));
		System.out.println(ref);
		System.out.println(ref.isEmpty());
		
		
		//Int
		Collection col =new ArrayList();
		col.add(1);
		col.add(2);
		col.add(3);
		col.add(4);
		col.add(5);
		col.add(6);
		col.add(7);
		col.add(8);
		col.add(9);
		col.add(10);
		
		System.out.println(col);
		System.out.println(col.size());
		System.out.println(col.add(11));
		System.out.println(col);
		System.out.println(col.contains(11));
		System.out.println(col.remove(10));
		System.out.println(col);
		System.out.println(col.equals(1));
		System.out.println(col.isEmpty());

	}

}

package com.xworkz.collection.basiccollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesterUsing2List {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(0, "Tiger");
		list.add(1, "Huli");
		list.add("Halli");
		list.add(3, null);
		list.add(4, "Dog");
		list.add("Naayi");
		list.add(6, 'k');

		System.out.println(list);

		System.out.println("-----------------------------");
		List list1 = new ArrayList();
		list1.add(0, "Naanu");
		list1.add(1, "ANnaji");
		list1.add(2, "Gymson");

		System.out.println(list1);
		list1.addAll(list);
		System.out.println(list1);
		list1.containsAll(list);

		list1.removeAll(list);
		System.out.println(list1);

	}

}

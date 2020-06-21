package com.aman.List;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet set= new TreeSet(new MyComparator());
		set.add(10);
		set.add(-70);
		set.add(100);
		set.add(30);
		System.out.println(set);
	}

}

package com.aman.List;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet set= new LinkedHashSet();
		
		set.add("B");
		set.add("A");
		set.add("G");
		set.add(1);
		System.out.println(set.add("A"));
		System.out.println(set);

	}

}

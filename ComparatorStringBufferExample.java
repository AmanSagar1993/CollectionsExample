package com.aman.List;

import java.util.TreeSet;

public class ComparatorStringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet set = new TreeSet(new ComparatorForStringBuffer());
		set.add("A");
		set.add(new StringBuffer("ABC"));
		set.add("a");
		set.add(new StringBuffer("XY"));
		set.add("X");
		System.out.println(set);

	}

}

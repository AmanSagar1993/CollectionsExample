package com.aman.List;

import java.util.TreeSet;

public class TreeSetComparableExample implements Comparable {

	public static void main(String[] args) {
	
		TreeSet treeSet = new TreeSet();
		treeSet.add(new StringBuffer("A"));
		treeSet.add(new StringBuffer("Z"));
		treeSet.add(new StringBuffer("M"));
		treeSet.add(new StringBuffer("K"));
		System.out.println(treeSet);

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

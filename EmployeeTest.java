package com.aman.List;

import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1= new Employee(1, "Sagar");
		Employee e2 = new Employee(2,"Aman");
		TreeSet treeSet = new TreeSet(new EmployeeComparator());
		treeSet.add(e1);
		treeSet.add(e2);
		System.out.println(treeSet);
		
		
	}

}

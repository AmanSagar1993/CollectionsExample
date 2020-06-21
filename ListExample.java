package com.aman.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> l= new ArrayList<>();
		List<String> l1 = new ArrayList<>();
		l1.add("4");
		l.add("Aman");
		l.add(1, "Sagar");
		l.addAll(2, l1);
		System.out.println(l);
		

	}

}

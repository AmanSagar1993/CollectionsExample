package com.aman.List;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		//return i2.compareTo(i1); Descending order output
		//return i1.compareTo(i2); AscendingOrder output
		//return -i1.compareTo(i2); Descending Order
		//return -i2.compareTo(i1); Ascending Order
		//return 1; //Insertion order
		//return -1; //Reverse of Insertion order
		return 0;
		
		
		
	}

}

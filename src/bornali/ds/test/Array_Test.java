package bornali.ds.test;

import bornali.ds.Array;
import bornali.ds.DataStructures;
import bornali.ds.StaticTest.InnerStaticTest;

public class Array_Test {

	static int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static int size = a.length;
	static DataStructures ds;

	public static void main(String[] args) {

	    ds = new Array(a);			
		ds.print();
		ds.insertion(size, 29, 3);
		ds.print();
		
	}

}

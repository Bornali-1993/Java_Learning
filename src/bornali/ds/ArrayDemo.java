package bornali.ds;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration of an array
		int[] arr1 = new int[5];

		// Initialization of an array
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;			
		}

		// OPERATIONS:
		// 1. Traversing
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// 2. Searching
		int x = 3;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] == x) 
				System.out.println("Found " + x + "at " + i);
		}
		
		// 3. Insertion
		
		

		// int[] arr2 = {0,1,2,3,4};
		// int[] arr3 = new int[]{0,1,2,3,4};
	}

}

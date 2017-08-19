package bornali.ds;

import java.util.Scanner;

public class Array implements DataStructures{
	private static int[] arr = new int[50];
	private static int lSIZE = 0;

	public Array(int[] a){
		System.out.println("Welcome to Array Operations...");
		arrayFill(a);		
	}
	
	private void arrayFill(int[] array) {
		lSIZE = array.length;
		for (int i = 0; i < array.length; i++)
			arr[i] = array[i];
	}
	
	@Override
	public void print() {
		for (int i = 0; i < lSIZE; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\n");
	}
	
	@Override
	public void insertion(int size, int insert, int pos) {
		for (int i = size; i > pos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos] = insert;
		lSIZE = lSIZE + 1;
		
	}	

	@Override
	public int search() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}
}

package practice.bornali.programs;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int m = in.nextInt();
		System.out.print("Enter second number: ");
		int n = in.nextInt();
		System.out.println("Before swapping m = " + m + " n = " + n);
		int temp;
		temp = m;
		m = n;
		n = temp;
		System.out.println("After swapping m = " + m + " n = " + n);
	}

}

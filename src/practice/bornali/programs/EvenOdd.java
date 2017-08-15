package practice.bornali.programs;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please..... Enter any number: ");
		int n = in.nextInt();
		if (n % 2 == 0)
			System.out.println("Entered Number is an Even Number");
		else
			System.out.println("Entered Number is an Odd Number");

	}

}

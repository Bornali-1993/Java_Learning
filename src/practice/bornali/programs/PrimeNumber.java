package practice.bornali.programs;

import java.util.Scanner;

/*
 * @author Bornali Nath
 * @date 11/06/2017
 * @time 3:48 PM
 */
public class PrimeNumber {
	/**
	 * 
	 * @param x
	 * @return : boolean
	 */
	boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = in.nextInt();
		PrimeNumber obj = new PrimeNumber();
		boolean prime = obj.isPrime(n);
		if (prime)
			System.out.println("Yes, " + n + " is a prime number");
		else
			System.out.println("No, " + n + " is not a prime number");
	}
}

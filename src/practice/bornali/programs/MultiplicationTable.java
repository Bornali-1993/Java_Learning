package practice.bornali.programs;

import java.util.Scanner;

class MultiplicationTable {
	public int table(int n) {
		int res = 0;
		for (int i = 0; i <= 10; i++) {
			res = n * i;
			System.out.println(n + "X" + i + "=" + res);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("Enter the number: " + num);

		MultiplicationTable obj = new MultiplicationTable();
		System.out.println("The multiplication table for the given number: ");
		obj.table(num);
	}
}
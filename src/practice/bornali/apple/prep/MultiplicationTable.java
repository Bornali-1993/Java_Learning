package practice.bornali.apple.prep;

import java.util.Scanner;

public class MultiplicationTable {
	public int multTable(int n) {
		int res = 0;
		for (int i = 1; i <= 10; i++) {
			res = n * i;
			System.out.println(n + " X " + i + " = " + res);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		MultiplicationTable obj = new MultiplicationTable();
		System.out.println("The multiplication table for the given number: ");
		obj.multTable(num);
	}

}

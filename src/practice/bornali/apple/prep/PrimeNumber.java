package practice.bornali.apple.prep;

public class PrimeNumber {
	int x;

	public static void main(String[] args) {
		boolean flag = false;
		PrimeNumber obj = new PrimeNumber();
		obj.x = 13;
		for (int i = 2; i < obj.x; i++) {
			if (obj.x % i == 0) {
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Number " + obj.x + " is a prime number");
		} else {
			System.out.println("Number " + obj.x + " is not a prime number");
		}

	}
}
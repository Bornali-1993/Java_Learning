package practice.bornali.apple.prep;

public class Reversals {

	// TODO Auto-generated method stub
	/*
	 * palindrome of a string
	 */
	boolean strPalindrome(String s) {
		boolean flag = false;
		int len = s.length();

		for (int i = 0; i < len / 2; i++) {

			if (s.charAt(i) == s.charAt(len - i - 1))
				flag = true;
			else {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		return flag;
	}

	/*
	 * palindrome of a number
	 */
	boolean numberPalindrome(int n) {
		boolean flag = false;
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		if (temp == sum)
			flag = true;
		else
			flag = false;
		System.out.println(flag);
		return flag;
	}

	/*
	 * Reverse of a string
	 */
	String strReverse(String str) {
		int len = str.length();
		char temp;
		char strArr[] = str.toCharArray();
		for (int i = 0; i < len / 2; i++) {
			temp = str.charAt(i);
			strArr[i] = str.charAt(len - i - 1);
			strArr[len - i - 1] = temp;
		}
		return new String(strArr);
	}

	/*
	 * Reverse of a number
	 */
	int numberReverse(int num) {
		int sum=0;
		while(num>0){
			int rem = num%10;
			sum= (sum*10) + rem;
			num=num/10;
		}
	return sum;
	}
	public static void main(String[] args) {
		Reversals r = new Reversals();
		// r.strPalindrome("AbbA");
		// r.numberPalindrome(98);
		// System.out.println(r.strReverse("Bornali"));
		System.out.println(r.numberReverse(23456));
	}

}

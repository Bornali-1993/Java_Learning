
public class Square {
	public static int square_example(int a) {
		int square = a * a;
		return square;
	}

	public static void main(String[] args) {
		int b = 25;
		int sq;
		sq = square_example(b);
		System.out.println("Square of the given number " + b + " : = " + sq);
	}

}

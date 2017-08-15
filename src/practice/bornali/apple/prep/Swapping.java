package practice.bornali.apple.prep;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 15;
		System.out.println("Before swapping: " + x +" "+y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping: " + x +" "+ y);
	}

}

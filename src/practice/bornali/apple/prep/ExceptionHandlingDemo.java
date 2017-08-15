package practice.bornali.apple.prep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemo {

	public int division(int a, int b) throws FileNotFoundException {
		FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);
		return a / b;

	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ExceptionHandlingDemo ed = new ExceptionHandlingDemo();
		System.out.println(ed.division(1, 0));
		// System.out.println(ed.division(1,0));
		try {
			
			System.out.println("DIVISION");
			System.out.println(ed.division(1, 0));
			
		} catch (ArrayIndexOutOfBoundsException e) {

		} catch (Exception e) {
			System.out.println("YOUR OUTPUT IS OFF LIMITS: \n" + e.getMessage());
			System.out.println(e.toString());
		}
		
		System.out.println("After Exception is caught");
		
	}
}

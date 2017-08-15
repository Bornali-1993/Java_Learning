package practice.bornali.programs;

import java.util.Scanner;

public class TempConvertor {
	Scanner in = null;

	public TempConvertor() {
		System.out.println("*******************TEMPERATURE CONVERTOR*******************");
		in = new Scanner(System.in);
	}

	/**
	 * 
	 * @param c
	 *            : double
	 * @return void
	 */
	public void c2fConvertor() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Please enter temperature in \u00b0C:");
		double celVal = in.nextDouble();
		System.out.println("\t\t " + celVal + "\u00b0C ------------> " + c2fConvertorLogic(celVal) + "\u00b0F");

	}

	private double c2fConvertorLogic(double c) {
		return ((9.0 / 5.0) * c) + 32;
	}

	/**
	 * 
	 * @param f
	 *            : double
	 * @return double
	 */
	public void f2cConvertor() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Please enter temperature in \u00b0F:");
		double farVal = in.nextDouble();
		System.out.println("\t\t " + farVal + "\u00b0F ------------> " + f2cConvertorLogic(farVal) + "\u00b0C");

	}
	private double f2cConvertorLogic(double f) {
		return ((f-32)*5.0)/9.0; 
		
	}

}

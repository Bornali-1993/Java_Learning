
public class Test {

	public static void main(String[] args) {
		First.a=100;
		System.out.println("Value of the static variable a = "+First.a);
		First.Change();
		System.out.println("Value of the static variable changed in static method = "+First.a);
		First obj1 = RetObj.returnFirst();
		obj1.b=10;
		System.out.println("Value of b as the Instance variable = "+obj1.b);
		First obj2 = RetObj.returnFirst();
		obj2.Instance(20);
		System.out.println("Value of b from the Instance method = "+obj2.b);

	}

}

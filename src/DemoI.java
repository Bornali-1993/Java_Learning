

public class DemoI extends DemoII{

	public static final String username = "Bornali";
	static int vari1 = 20;
	int vari2;
//	DemoI(){
//		a=10;
//		vari2=30;
//		
//	}
//	{
//		
//		System.out.println("Hi! I am STATIC");
//	}
//	
	static void main(String k){
		System.out.println("Hi! My name is " + k);
		
	}
	
	public static void main(String[] a) {
		// TODO Auto-generated method stub
		//DemoI d = new DemoI();
		//main("Bornali");
		
		DemoII d = new DemoI();
		DemoII dd = new DemoI();
		String s1 = new String("hello");
		String s2 = "Hello";    //new String("Hello");    //  String Literal
		String s3 = "Hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2 == s3);	
		
//		dd.vari1;
//		d.vari2;
//		d.vari1;
	
	}

}

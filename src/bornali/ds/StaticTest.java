package bornali.ds;

public class StaticTest {

	public static class InnerStaticTest{
		public InnerStaticTest(){
			System.out.println("Inside InnerStaticTest");			
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerStaticTest ist = new InnerStaticTest();
		InnerStaticTest obj = ist;
		System.out.println(ist +"\n"+obj);
		

	}

}

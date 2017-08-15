
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am an employee of wipro";
		System.out.println(str.length());
		System.out.println(str.indexOf('w'));
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf("wipro"));
		
		String s3=new String("hello");
		String s4="hello";
		if(s3==s4)
			System.out.println("equal");
		else
			System.out.println("unequal");
		
		if(s3.equals(s4))
			System.out.println("equal");
		else
			System.out.println("unequal");
		
		String sampleStr = "wipro";
		String s[] = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(sampleStr))
				System.out.println(i);
		}
	}

}

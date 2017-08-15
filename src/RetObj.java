
public class RetObj {

	private static First first;

	public static First returnFirst() {

		if (first == null)
			first = new First();
		
		return first;
	}

}

package Flow_Control;

public class BooleanApp {

	public static void main(String[] args) {
		System.out.println("One");
		System.out.println(1);
		// boolean
		System.out.println(true);
		System.out.println(false);

		String foo = "Hello world";
//		String true = "Hello world"; => 사용 불가 - reserved word (예약어)
		
		System.out.println(foo.contains("world"));	// true
		System.out.println(foo.contains("egoing"));	// false
		
	}

}

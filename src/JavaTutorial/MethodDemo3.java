package JavaTutorial;

public class MethodDemo3 {
	public static String numbering(int init, int limit) {	// 메소드 앞에는 반환형을 써줌 (이 메소드가 return한 값은 String형)
		int i = init;
		String output = " ";
		while(i < limit) {
			output += i;
			i++;
		}
		return output;
	
	}
	
	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);

	}

}

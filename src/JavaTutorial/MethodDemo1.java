package JavaTutorial;

public class MethodDemo1 {
	public static void Numbering(int limit) {	// 매개변수(parameter)
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		Numbering(10);	// 인자(argument)

	}

}

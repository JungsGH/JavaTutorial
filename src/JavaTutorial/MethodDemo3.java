package JavaTutorial;

public class MethodDemo3 {
	public static String numbering(int init, int limit) {	// �޼ҵ� �տ��� ��ȯ���� ���� (�� �޼ҵ尡 return�� ���� String��)
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

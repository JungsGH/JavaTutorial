package JavaTutorial;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}
	/*
	 * sc.hasNextInt()
	 * - 1. ������� �Է°��� ����(enter) ������, �����Ǿ� �ִ� ������ �簳��
	 * - 2. int�� �Է� �� : true�� �ԷµǾ� while�� ����
	 * - 	int�� �̿��� ���� �Է� �� : false�� �ԷµǾ� sc.close() ����
	 */

}

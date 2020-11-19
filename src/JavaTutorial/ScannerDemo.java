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
	 * - 1. 사용자의 입력값이 공백(enter) 들어오면, 중지되어 있던 실행을 재개함
	 * - 2. int형 입력 시 : true로 입력되어 while문 실행
	 * - 	int형 이외의 값을 입력 시 : false로 입력되어 sc.close() 실행
	 */

}

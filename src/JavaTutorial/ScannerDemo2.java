package JavaTutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		} catch(FileNotFoundException e) {	// out.txt를 찾지 못할 때, 에러의 내용을 화면에 출력
			e.printStackTrace();
		}

	}

}

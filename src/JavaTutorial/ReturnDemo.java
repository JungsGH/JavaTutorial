package JavaTutorial;

public class ReturnDemo {
	public static String[] getMember() {
		String[] members = {"������", "������", "���̶�"	};
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMember();
		for(String e : members) {
			System.out.println(e);
		}

	}

}

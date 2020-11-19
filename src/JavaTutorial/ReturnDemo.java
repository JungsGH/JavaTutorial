package JavaTutorial;

public class ReturnDemo {
	public static String[] getMember() {
		String[] members = {"ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑÀÌ¶÷"	};
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMember();
		for(String e : members) {
			System.out.println(e);
		}

	}

}

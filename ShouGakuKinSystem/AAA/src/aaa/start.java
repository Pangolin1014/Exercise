package aaa;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "qwertyuiojhgvbnlghjkpkjhgfsertyuiklkaaa";
		char key = 'a';
		
		Alphabet alphabet = new Alphabet();
		int number = alphabet.shearch(words,key);
		
		System.out.print(key+"字符的数量是"+number+"个");
	}

}

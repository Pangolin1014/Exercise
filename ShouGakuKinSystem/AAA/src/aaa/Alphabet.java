package aaa;

public class Alphabet {

	public int shearch(String words, char key) {
		// TODO Auto-generated method stub
		
		char[] arr = words.toCharArray(); 
		
		char c;
		
		int number = 0;
		
		for (int i=0; i<arr.length; i++) {
			
			c = arr[i];
			
			if(c==key) {
				number = number+1;
			}
        }
		
		return number;
	}

	
}

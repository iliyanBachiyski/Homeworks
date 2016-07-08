import java.util.Arrays;
import java.util.Scanner;


public class LetterCounting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert String: ");
		String sentence = sc.nextLine();
		int count = 0;
		char[] letters = new char[sentence.length()];
		
		for (int i = 0; i < sentence.length(); i++) {
			
			if( ( (int) sentence.charAt(i) >= 65 && (int) sentence.charAt(i) <=90 ) || (int) sentence.charAt(i) >= 97 && (int) sentence.charAt(i) <=122 ) {
				count++;
				letters[count] = sentence.charAt(i);
				
			}
		}	
		System.out.println(count);
		System.out.println(Arrays.toString(letters));
	}

}

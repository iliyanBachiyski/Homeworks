import java.util.Scanner;


public class IsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert word: ");
		String word = sc.next();
		char[] arr = word.toCharArray();
		int count = arr.length-1;
		boolean flag = true;
		
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(i<count){
				if(arr[i] != arr[count]){
					flag = false;
					break;
				}
				count--;
			}
		}
		
		if(flag){
			System.out.println("Is Palindrome!");
		}else{
			System.out.println("Not Palindrome!");
		}

	}

}

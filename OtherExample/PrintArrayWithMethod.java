import java.util.Arrays;


public class PrintArrayWithMethod {

	public static void main(String[] args) {
		char[] masiv = {'c' , 'x', '!', '@', '2', '-', '*' };
		printArray(masiv);
		
	}
	
	static void printArray(char[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//System.out.println(Arrays.toString(arr));
		
	}

}

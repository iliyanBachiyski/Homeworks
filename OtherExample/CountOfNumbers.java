
public class CountOfNumbers {

	public static void main(String[] args) {
		char[] arr = {'4' , 'x', '@', '$', 'S', 'a', '8'};
		System.out.println("The number of numbers is: " + check(arr));

	}
	
	static int check(char[] arr){
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int x = (int)arr[i];
			if( x>=48 && x <=57){
				System.out.println("The num is: " + arr[i]);
				count++;
			}
		}

		return count;
	}

}

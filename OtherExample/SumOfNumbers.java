import java.util.Scanner;


public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert first Number: ");
		int first = sc.nextInt();
		System.out.println("Insert second Number: ");
		int second = sc.nextInt();
		System.out.println("The sum is: " + sumNumbers(first, second));

	}
	
	static int sumNumbers(int a , int b){
		int sum = a+b;
		return sum;
	}
}

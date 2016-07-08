import java.util.Scanner;


public class IsEqual {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number: ");
		int x = sc.nextInt();
		System.out.println("Insert number: ");
		int y = sc.nextInt();
		System.out.println(isEqual(x, y));
	}
	
	static String isEqual(int a , int b){

		if(a==b){
			return "Equal";
		}
		return "Not Equal";
	}
}

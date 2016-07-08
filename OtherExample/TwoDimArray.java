import java.util.Arrays;
import java.util.Scanner;


public class TwoDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert num of rows: ");
		int first = sc.nextInt();
		System.out.println("Insert num of colums: ");
		int second = sc.nextInt();
		System.out.println(Arrays.deepToString(createArray(first, second)));
	}	
	
	static int[][] createArray(int row , int col){
		
		int [][] arr = new int[row][col];
		return arr;
	}

}

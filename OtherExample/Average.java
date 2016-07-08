import java.util.Scanner;


public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert First Number: ");
		double first = sc.nextDouble();
		System.out.println("Insert Second Number: ");
		double second = sc.nextDouble();
		System.out.println(average(first, second));

	}
	
	static double average(double a , double b){
		double avg =(a+b)/2;
		return avg;
	}

}

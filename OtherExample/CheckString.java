import java.util.Scanner;


public class CheckString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert firts string: ");
		String first = sc.nextLine();
		System.out.println("Insert second string: ");
		String second = sc.nextLine();
		String check = second.substring(0, first.length());
		System.out.println(first.equalsIgnoreCase(check));

	}

}

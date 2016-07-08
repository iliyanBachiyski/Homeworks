import java.util.Scanner;


public class PrintInitials {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inset Your name: ");
		String fullName = sc.nextLine();
		
		for (int i = 0; i < fullName.length(); i++) {
			
			if(i == 0){
				fullName = fullName.toUpperCase();
				System.out.print(fullName.charAt(i) + ".");
			}
			fullName = fullName.toLowerCase();
			if(i!=0){
				if(fullName.charAt(i-1)== ' '){
					fullName = fullName.toUpperCase();
					System.out.println(fullName.charAt(i) + ".");
				}
			}
		}
	}
}

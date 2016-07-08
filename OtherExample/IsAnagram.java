import java.util.Scanner;


public class IsAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert first String: ");
		String first = sc.nextLine();
		System.out.println("Insert second String: ");
		String second = sc.nextLine();
		boolean flag = true;
		
		if(first.length() == second.length()){
			
			for (int i = 0; i < first.length(); i++) {
				
				for (int j = 0; j < second.length(); j++) {
					if(first.charAt(i)!=second.charAt(j)){
						flag = false;
					}else{
						flag = true;
						break;
					}
				}
				if(flag==false){
					break;
				}
			}
			
		}else{
			System.out.println("The Strings are not with equal length!");
		}
		
		if(flag){
			System.out.println("Is Anagram!");
		}else{
			System.out.println("Not Anagram!");
		}

	}

}

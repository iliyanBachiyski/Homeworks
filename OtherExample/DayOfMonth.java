import java.util.Scanner;


public class DayOfMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert month: ");
		String month = sc.next();
		System.out.println("Insert year: ");
		int year = sc.nextInt();
		System.out.println(checkMonth(month, year));
		

	}
	
	static int checkMonth(String month , int year){
		
		switch(month){
		
		case ("fevruari") : 
			if(year%4==0 || year%400==0){
				return 29;
			}else{
				return 28;
			}
		case "april"  : return 30;
		
		case "juni" : return 30;
		
		case "septemvri" : return 30;
		
		case "noemvri" : return 30;
		}
		
		return 31;
		
	}

}

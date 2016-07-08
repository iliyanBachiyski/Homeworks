import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		int inputCount = 0 ;
		input(inputCount);
	}
	
	static void input(int n){
		Scanner sc = new Scanner(System.in);
		int heads = 0;
		String text;
		do{
			System.out.println("Insert Heads or Tais: ");
			text = sc.next();
			
			if(text.equals("heads")){
				heads++;
			}else{
				heads=0;
			}
			if(heads==5){
				System.out.println("”–¿¿¿¿");
				return;
			}

		}while(!(text.equals("heads")) || !(text.equals("tails")));
		
	}
	
}
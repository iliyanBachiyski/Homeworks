
public class CanMakeTriangle {

	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		int c = 1;
		System.out.println(canMake(a, b, c));

	}
	
	static boolean canMake(int a , int b , int c){
		if((a < b + c) && (b < a + c) && (c < a + b) ){
			return true;
		}else{
			return false;
		}
	}
}

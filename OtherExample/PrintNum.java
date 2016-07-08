import java.util.Arrays;


public class PrintNum {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(print()));
	}
	
	static int[] print(){
		
		int arr[] = new int[20];
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%5==0){
				arr[count] = i;
				count++;
			}
		}
		
		return arr;
	}

}

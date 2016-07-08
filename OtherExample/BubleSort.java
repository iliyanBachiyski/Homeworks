import java.util.Arrays;


public class BubleSort {

	public static void main(String[] args) {
		int[] before = {1,8,9,11,2,33,5,};
		System.out.println(Arrays.toString(bubleSort(before)));

	}
	
	static int[] bubleSort(int[] arr){
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = false;
				}
			}
			if(flag){
				break;
			}
		}
		
		
		return arr;
	}
 
}

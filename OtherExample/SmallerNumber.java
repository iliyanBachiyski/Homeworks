import java.util.Arrays;


public class SmallerNumber {

	public static void main(String[] args) {
		int[] ar1 ={6,66,126,198,61,63};
		int[] ar2 ={1,8,2,66,99,22};
		System.out.println(Arrays.toString(checkSmall(ar1, ar2)));
	}
	
	static int[] checkSmall(int[] arr1 , int[] arr2){
		
		int[] newArr = new int[arr1.length];
		
		for (int i = 0; i < newArr.length; i++) {
			
			if(arr1[i]<arr2[i]){
				newArr[i] = arr1[i];
			}else{
				newArr[i] = arr2[i];
			}
		}
		
		return newArr;
	}

}

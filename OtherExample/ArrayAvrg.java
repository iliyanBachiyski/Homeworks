
public class ArrayAvrg {

	public static void main(String[] args) {
		int[] nums ={7,9,1,2,3,8,2};
		System.out.println(nums.length);
		System.out.println(average(nums));
		
	}
	
	static double average(int[] arr){
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int avg = sum/arr.length;
		
		return avg;
	}

}

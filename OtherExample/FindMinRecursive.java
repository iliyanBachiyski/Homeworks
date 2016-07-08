
public class FindMinRecursive {

	public static void main(String[] args) {
		int[] arr = {7,2,6,94,12,23};
		System.out.println(findMin(arr , 0, arr[0]));
	}
	
	static int findMin(int[] array , int start ,int min){
		
		if(start==array.length){
			return min;
		}
		if(min>array[start]){
			min = array[start];
		}
			
		return findMin(array , (start+1) , min);
	}

}


public class ArraysS {

	public static void main(String[] args) {
		double[] arr = {7,2,6,3,1};
		double[] arr1 = {6,3,25,2,9};
		proizvedenie(arr, arr1);
	}
	
	static void proizvedenie(double[] arr1 , double[] arr2){
		double[] newArr = new double[arr1.length];
		
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr1[i]*arr2[i];
			System.out.print("|" + newArr[i] + "|" );
		}
		
	}

}

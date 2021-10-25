package problem;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-5, 30, -7, 3, -10};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = Math.abs(arr[i]);
			}
			System.out.print(arr[i]+" ");
		}
	}

}

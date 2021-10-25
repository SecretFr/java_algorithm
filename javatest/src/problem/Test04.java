package problem;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25, 330, 50, 30, 50};
		int max = -1001;
		int min = 1001;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}

}

package problem;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {80, 70, 30, 20, 40};
		int sum = 0;
		int avg = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.print("avg: "+avg);
	}

}

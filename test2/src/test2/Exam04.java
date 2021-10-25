package test2;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		int index = 0;
		
		for(int i=1; i<11; i++) {
			if(i % 2 == 0) {
				arr[index] = i;
				index++;
			}
			if(index > 4) {
				break;
			}
		}
		int sum = 0;
		for(int val : arr) {
			sum = sum + val;
		}
		System.out.println(sum);
	}

}

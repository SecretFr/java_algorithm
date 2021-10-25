package test2;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[5];
		
		System.out.print("5개 실수 값 입력 : ");
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextDouble();
		}
		
		selectionSort(arr);
		
	}
	
	public static void selectionSort(double[] arr) {
		double temp; 
		int index=0;
		
		for(int i=0; i<arr.length; i++) {
			double min = Double.MAX_VALUE;
			for(int j=i; j<arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
//		for(int val : arr) {
//			System.out.println(val);
//		}
		
		System.out.println("Max Value: "+arr[4]);
		System.out.println("Min Value: "+arr[0]);
	}

}

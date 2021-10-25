package _sort;

public class insertionSort {
    public static void main(String[] args){
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int j, temp;
        for(int i=0; i<arr.length-1; i++){
            j = i;
            while(j>=0 && arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}

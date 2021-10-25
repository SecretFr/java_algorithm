package _sort;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int index = 0;
        int temp =0;
        for(int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j=i; j<arr.length; j++){
                if(min > arr[j] ){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}

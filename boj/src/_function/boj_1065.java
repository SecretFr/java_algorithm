package _function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// class TypeTest{
//     public void printType(int x){
//         System.out.println(x + " is an int");
//     }
// }

public class boj_1065 {
    /*test*/
    public static int FindHanSu(int n){
        int hanSu = 0;
        int[] arr = new int[3];

        for(int i=1; i<=n; i++){
            if(i>0 && i<100) hanSu = i;
            else if(i == 1000) break;
            else{
                int k = 0;
                int t = i;
                while(t>0){
                    arr[k] = t % 10;
                    t = t / 10;
                    k++;
                }
                if(arr[0] - arr[1] == arr[1] - arr[2]) hanSu++;
            }
        }

        return hanSu;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // TypeTest test = new TypeTest();
        int n = Integer.parseInt(br.readLine());
        // test.printType(n);
        int answer = 0;

        answer = FindHanSu(n);

        System.out.println(answer);
    }
}

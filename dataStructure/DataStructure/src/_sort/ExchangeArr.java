package _sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ExchangeArr {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int b_len = b.length-1;
        for(int i=0; i<k; i++){
            if(a[i] < b[b_len]){
                int temp = a[i];
                a[i] = b[b_len];
                b[b_len] = temp;
                b_len--;
            }
            else{
                break;
            }
            
        }

        int sum=0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        System.out.println(sum);
    }
}

package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
public class kakao_craneDollPick{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter boards & moves Size : ");
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] boards = new int[n][n];
        int[] moves = new int[m];

        System.out.println("Enter boards");
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                boards[i][j] = Integer.parseInt(st.nextToken());
                // System.out.print(boards[i][j]);
            }
            System.out.println();
        }

        System.out.println("Enter moves");
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<moves.length; i++){
            moves[i] = Integer.parseInt(st.nextToken());
            // System.out.println(moves[i]);
        }
        System.out.println("answer: ");
        System.out.println(solution(boards, moves));
    }
    public static int solution(int[][] boards, int[] moves){
        Stack<Integer> stack = new Stack<Integer>();
        int cnt = 0;
        stack.push(0);
        for(int move : moves){
            for(int i = 0; i < boards.length; i++){
                if(boards[i][move-1] != 0){
                    if(stack.peek() == boards[i][move-1]){
                        stack.pop();
                        cnt = cnt + 2;
                    }
                    else{
                        stack.push(boards[i][move-1]);
                    }
                    boards[i][move-1] = 0;
                    break;
                }
            }
        }
        return cnt;
    }
}
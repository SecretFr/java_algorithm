package _algorithm._implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://programmers.co.kr/learn/courses/30/lessons/60059

class Solution1{
    //2차원 배열 90도 회전 method
    public static int[][] rotateMatrixBy90Degree(int[][] a){
        int n = a.length;
        int m = a[0].length;
        int[][] result = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[j][n-i-1] = a[i][j];
            }
        }

        return result;
    }

    //자물쇠 중앙이 모두 1인지 확인
    public static boolean check(int[][] newLock){
        int lockLength = newLock.length / 3;
        for(int i=lockLength; i<lockLength*2; i++){
            for(int j=lockLength; j<lockLength*2; j++){
                if(newLock[i][j] != 1){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean solution(int[][] key, int[][] lock){
        
        int n = lock.length;
        int m = key.length;
        //자물쇠의 크기를 기존의 3배로 변환
        int[][] newLock = new int[n * 3][n * 3];

        //새로운 자물쇠의 중앙 부분에 기존의 자물쇠 넣기
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                newLock[i+n][j+n] = lock[i][j];
            }
        }

        //4가지 방향에 대해서 확인
        for(int rotation = 0; rotation<4; rotation++){
            //key 90도 회전
            key = rotateMatrixBy90Degree(key);
            for(int x=0; x<n*2; x++){
                for(int y=0; y<n*2; y++){
                    //자물쇠에 열쇠 끼워 넣기
                    for(int i=0; i<m; i++){
                        for(int j=0; j<m; j++){
                            newLock[x+i][y+j] += key[i][j];
                        }
                    }
                    if(check(newLock)) return true;
                    for(int i=0; i<m; i++){
                        for(int j=0; j<m; j++){
                            newLock[x+i][y+j] -= key[i][j];
                        }
                    }
                }
            }
        }
        return false;
    }
}

public class LockandKey {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] key = new int[m][m];
        int[][] lock = new int[n][n];

        System.out.println("input key matrix");
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++){
                key[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println();

        System.out.println("input lock matrix");
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++){
                lock[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Solution1 sol = new Solution1();
        boolean answer;
        answer = sol.solution(key, lock);

        System.out.println();

        System.out.print("answer is : ");
        System.out.println(answer);
    }
}

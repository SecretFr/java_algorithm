package practice._implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution{
    public int solution(String s){
        int answer = s.length();
        
        for(int step=1; step<s.length() / 2 + 1; step++){
            int cnt = 1;
            String prev = s.substring(0, step);
            String comp = "";

            for(int j=step; j<s.length(); j+=step){
                String sub = "";
                for(int k=j; k<j+step; k++){
                    if(k<s.length()){
                        sub += s.charAt(k);
                    }
                }

                if(prev.equals(sub)) cnt += 1;
                else{
                    comp += (cnt >= 2) ? cnt + prev : prev;
                    sub = "";
                    for(int k=j; k<j+step; k++){
                        if(k<s.length()){
                            sub += s.charAt(k);
                        }
                    }

                    prev = sub;
                    cnt = 1;
                }
            }

            comp += (cnt >= 2) ? cnt + prev : prev;
            answer = Math.min(answer, comp.length());

        }
        return answer;
    }    
}

public class StrPress {
    public static void main(String[] args){
        Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        try {
            String input = br.readLine();
            answer = sol.solution(input);
            System.out.println(answer);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

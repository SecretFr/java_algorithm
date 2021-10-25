package _algorithm._implementation;

import java.util.*;

//기둥과 보 설치
//https://programmers.co.kr/learn/courses/30/lessons/60061

class Node1 implements Comparable<Node1>{
    private int x;
    private int y;
    private int stuff;

    public Node1(int x, int y, int stuff){
        this.x = x;
        this.y = y;
        this.stuff = stuff;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getStuff(){
        return this.stuff;
    }

    //정렬 기준 설정(x, y, stuff 순서대로 오름차순)
    @Override
    public int compareTo(Node1 other) {
        // TODO Auto-generated method stub
        if(this.x == other.x && this.y == other.y){
            return Integer.compare(this.stuff, other.stuff);
        }
        if(this.x == other.x){
            return Integer.compare(this.y, other.y);
        }
        return Integer.compare(this.x, other.x);
    }

}

class Solution2{

    // 현재 설치된 구조물이 '가능한' 구조물인지 확인하는 함수
    public boolean possible(ArrayList<ArrayList<Integer>> answer){
        for(int i=0; i<answer.size(); i++){
            int x = answer.get(i).get(0);
            int y = answer.get(i).get(1);
            int stuff = answer.get(i).get(2);

            //설치된 것이 기둥일 경우
            if(stuff == 0){
                boolean check = false;
                //'바닥 위'라면 정상
                if(y==0) check = true;

                //'보의 한 쪽 끝 부분 위' 또는 '다른 기둥 위'라면 정상
                for(int j=0; j<answer.size(); j++){
                    if(x-1 == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2)){
                        check = true;
                    }
                    if(x == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2)){
                        check = true;
                    }
                    if(x == answer.get(j).get(0) && y-1 == answer.get(j).get(1) && 0 == answer.get(j).get(2)){
                        check = true;
                    }
                }
            }
            //설치된 것이 보일 경우
            else if(stuff == 1){
                boolean check = false;
                boolean left = false;
                boolean right = false;
                //'한쪽 끝부분이 기둥위' 혹은 '양쪽 끝부분이 다른 보와 동시에 연결'이라면 정상
                for(int j=0; j<answer.size(); j++){
                    if (x == answer.get(j).get(0) && y - 1 == answer.get(j).get(1) && 0 == answer.get(j).get(2)) {
                        check = true;
                    }
                    if (x + 1 == answer.get(j).get(0) && y - 1 == answer.get(j).get(1) && 0 == answer.get(j).get(2)) {
                        check = true;
                    }
                    if (x - 1 == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2)) {
                        left = true;
                    }
                    if (x + 1 == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2)) {
                        right = true;
                    }
                }
                if(left && right) check = true;
                if(!check) return false;
            }
        }
        return true;
    }

    public int[][] solution(int n, int[][] build_frame) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<build_frame.length; i++){
            int x = build_frame[i][0];
            int y = build_frame[i][1];
            int stuff = build_frame[i][2];
            int operate = build_frame[i][3];

            //삭제하는 경우
            if(operate == 0){
                int index = 0;
                for(int j=0; j<answer.size(); j++){
                    if(x == answer.get(j).get(0) && y == answer.get(j).get(1) && stuff == answer.get(j).get(2)){
                        index = j;
                    }
                }
                ArrayList<Integer> erased = answer.get(index);
                answer.remove(index);
                //가능한 구조물인지 확인
                if(!possible(answer)){
                    answer.add(erased);
                }

            }

            //설치하는 경우
            if(operate == 1){
                ArrayList<Integer> inserted = new ArrayList<Integer>();
                inserted.add(x);
                inserted.add(y);
                inserted.add(stuff);
                answer.add(inserted);
                if(!possible(answer)){
                    answer.remove(answer.size() - 1);
                }
            }

        }

        //정렬 수행
        ArrayList<Node1> ans = new ArrayList<Node1>();
        for(int i=0; i<answer.size(); i++){
            ans.add(new Node1(answer.get(i).get(0), answer.get(i).get(1), answer.get(i).get(2)));
        }
        Collections.sort(ans);

        int[][] res = new int[ans.size()][3];
        for(int i=0; i<ans.size(); i++){
            res[i][0] = ans.get(i).getX();
            res[i][1] = ans.get(i).getY();
            res[i][2] = ans.get(i).getStuff();
        }

        return res;
    }
}

public class ColandBeamInstall {
    public static void main(String[] args){
        int n = 5;
        int[][] arr = new int[][]{
            {1,0,0,1},
            {1,1,1,1},
            {2,1,0,1},
            {2,2,1,1},
            {5,0,0,1},
            {5,1,0,1},
            {4,2,1,1},
            {3,2,1,1}
        };

        Solution2 sol = new Solution2();
        int[][] ans = sol.solution(n, arr);
        for(int i=0; i<ans.length; i++){
            int[] inArr = ans[i];
            System.out.print("[ ");
            for(int j=0; j<inArr.length; j++){
                System.out.print(inArr[j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    
}

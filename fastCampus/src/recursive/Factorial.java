package recursive;

import java.util.ArrayList;

/* O(n)
*  재귀호출은 스택의 좋은 예시
* */
public class Factorial {
    public int factorialFunc(int n){
        if(n>1){
            return n * this.factorialFunc(n-1);
        }
        else{
            return 1;
        }
    }

    public int factorialArrayFunc(ArrayList<Integer> dataList){
        if(dataList.size() <= 0){
            return 0;
        }
        else{
            return dataList.get(0) + this.factorialArrayFunc(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
        }
    }

    /* 연습
    *  정수 4를 1,2,3의 조합으로 나타내는 방법은 다음과 같이 총 7가지가 있음 - 정수 n이 입력으로 주어졌을 때, n을 1,2,3의 합으로 나타낼 수 있는 방법의 수를 구하시오.
    * 1+1+1+1
    * 1+1+2
    * 1+2+1
    * 2+1+1
    * 2+2
    * 1+3
    * 3+1
    * */

    public int integerFactorial(int data){
        if(data == 1){
            return 1;
        }
        else if(data == 2){
            return 2;
        }
        else if(data == 3){
            return 4;
        }
        return this.integerFactorial(data-1) + this.integerFactorial(data-2) + this.integerFactorial(data-3);
    }

    public static void main(String[] args){
        Factorial factorial = new Factorial();
        int result = factorial.factorialFunc(5);
        System.out.println(result);

        ArrayList<Integer> testData = new ArrayList<>();
        for(int i=0; i<10; i++){
            testData.add(i);
        }
        System.out.println(testData);
        System.out.println(testData.subList(1, testData.size()));

        int resultSumArray = factorial.factorialArrayFunc(testData);
        System.out.println(resultSumArray);

        int resultIntegerFactorial = factorial.integerFactorial(5);
        System.out.println(resultIntegerFactorial);
    }
}

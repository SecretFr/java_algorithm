package _algorithm._dfs;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<5; i++){
            stack.push(i+1);
            System.out.println("Stack Peek()"+stack.peek());
        }
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search(4));
        System.out.println(stack.empty());
    }
}

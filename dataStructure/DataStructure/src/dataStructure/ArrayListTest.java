package dataStructure;

import java.util.Iterator;

// import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        // ArrayList<Integer> numbers = new ArrayList<>();

        // numbers.add(10);
        // numbers.add(30);
        // numbers.add(40);
        // numbers.add(50);
        // System.out.println(numbers);
        // numbers.add(1,100);
        // System.out.println(numbers);

        // numbers.remove(2);
        // System.out.println(numbers);

        
        // System.out.println(numbers.get(2));
        // System.out.println(numbers.size());

        // Iterator iter = numbers.iterator();

        // while(iter.hasNext()){
        //     int val = (int) iter.next();
        //     System.out.println(val);
        // }

        // for(int value : numbers){
        //     System.out.println(value);
        // }

        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.get(3));
        System.out.println(numbers.size());
        numbers.add(1, 15);
        numbers.addFirst(0);
        numbers.add(1, 50);
        numbers.remove(0); 
        System.out.println(numbers.removeFirst());
        System.out.println(numbers.remove(2));
        System.out.println(numbers.toString());

        // for(int i=0; i<numbers.size(); i++){
        //     System.out.print(numbers.get(i)+" ");
        // }

        ArrayList.ListIterator li = numbers.listIterator();
        
        while(li.hasNext()){
            int number = (int) li.next();
            if(number == 30){
                li.remove();
            }
        }

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}

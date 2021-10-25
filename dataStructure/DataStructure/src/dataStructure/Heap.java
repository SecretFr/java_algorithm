package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
/*
데이터에서 최대값과 최소값을 빠르게 찾기 위해 고안된 완전 이진 트리
완전 이진 트리: 노드를 삽입할 때 최하단 왼쪽 노드부터 차례대로 삽입하는 트리
최대값 최소값 찾을 때 : 배열 O(n) / 힙 O(logn)
우선순위 큐와 같이 최대값 또는 최소값을 빠르게 찾아야 하는 자료구조 및 알고리즘 구현 등에 활용됨
*/
/*
* 부모노드 인덱스 번호 = 자식 노드 인덱스 번호 / 2
* 왼쪽 자식 노드 인덱스 번호 = 부모노드 인덱스 번호 * 2
* 오른쪽 자식 노드 인덱스 번호 = 부모노드 인덱스 번호 * 2 + 1
* */
public class Heap {
    public ArrayList<Integer> heapArray = null;

    public Heap(Integer data){
        heapArray = new ArrayList<Integer>();

        //계산 복잡도를 떨어뜨리기 위해서 0번지는 null로 초기화
        heapArray.add(null);
        heapArray.add(data);
    }

    public boolean moveUp(Integer inserted_idx){
        if(inserted_idx <= 1){
            return false;
        }
        else{
            Integer parent_idx = inserted_idx / 2;
            if(this.heapArray.get(inserted_idx) > this.heapArray.get(parent_idx)) return true;
            else return false;
        }
    }

    public boolean insert(Integer data){
        Integer inserted_idx, parent_idx;
        if(heapArray == null){
            heapArray = new ArrayList<Integer>();
            heapArray.add(null);
            heapArray.add(data);
            return true;
        }
        this.heapArray.add(data);
        inserted_idx = this.heapArray.size() - 1;

        while (this.moveUp(inserted_idx)){
            parent_idx = inserted_idx / 2;
            Collections.swap(this.heapArray, inserted_idx, parent_idx);
            inserted_idx = parent_idx;
        }
        return true;
    }

    public boolean moveDown(Integer popped_idx){
        Integer left_child_popped_idx, right_child_popped_idx;

        left_child_popped_idx = popped_idx * 2;
        right_child_popped_idx = popped_idx * 2 + 1;

        //case:1 왼쪽 자식 노드도 없을때(자식 노드가 하나도 없을때)
        if(left_child_popped_idx >= this.heapArray.size()){
            return false;
        }
        //case2: 오른쪽 자식 노드만 없을때
        else if(right_child_popped_idx >= this.heapArray.size()){
            if(this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)){
                return true;
            }
            else{
                return false;
            }
        }
        //case3: 왼쪽/오른쪽 자식 노드가 모두 있을 때
        else{
            if(this.heapArray.get(left_child_popped_idx) > this.heapArray.get(right_child_popped_idx)){
                if(this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if(this.heapArray.get(popped_idx) < this.heapArray.get(right_child_popped_idx)){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }

    public Integer pop(){
        Integer returned_data, popped_idx, left_child_popped_idx, right_child_popped_idx;
        if(this.heapArray == null){
            return null;
        }
        else {
            returned_data = this.heapArray.get(1);
            this.heapArray.set(1, this.heapArray.get(this.heapArray.size()-1));
            this.heapArray.remove(this.heapArray.size()-1);

            popped_idx = 1;
            while (this.moveDown(popped_idx)){
                left_child_popped_idx = popped_idx * 2;
                right_child_popped_idx = popped_idx * 2 + 1;
                //case2: 오른쪽 자식 노드만 없을때
                if(right_child_popped_idx >= this.heapArray.size()){
                    if(this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)){
                        Collections.swap(this.heapArray, popped_idx, left_child_popped_idx);
                        popped_idx = left_child_popped_idx;
                    }
                }
                //case3: 왼쪽/오른쪽 자식 노드가 모두 있을 때
                else {
                    if(this.heapArray.get(left_child_popped_idx) > this.heapArray.get(right_child_popped_idx)){
                        if(this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)){
                            Collections.swap(this.heapArray, popped_idx, left_child_popped_idx);
                            popped_idx = left_child_popped_idx;
                        }
                    }
                    else {
                        if(this.heapArray.get(popped_idx) < this.heapArray.get(right_child_popped_idx)){
                            Collections.swap(this.heapArray, popped_idx, right_child_popped_idx);
                            popped_idx = right_child_popped_idx;
                        }
                    }
                }
            }
            return returned_data;
        }
    }

    public static void main(String[] args){
        Heap heap = new Heap(15);
        heap.insert(10);
        heap.insert(8);
        heap.insert(5);
        heap.insert(4);
        heap.insert(20);
        System.out.println(heap.heapArray);

        System.out.println(heap.pop());
        System.out.println(heap.heapArray);
    }
}

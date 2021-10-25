package dataStructure;


/*
미리 데이터 공간을 미리 할당하지 않아도 된다.(배열은 공간을 할당해야함)
접근 속도가 느림(순차적으로 접근해야하기 때문)
*/

class linkNode<T>{
    T data;
    linkNode<T> next = null;

    public linkNode(T data) {
        this.data = data;
    }
}

class SingleLinkedList<T>{
    public linkNode<T> head = null;

    public void addNode(T data){
        if(head == null){
            head = new linkNode<T>(data);
        }
        else{
            linkNode<T> node = this.head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new linkNode<T>(data);
        }
    }
    public linkNode<T> search(T data){
        if(this.head == null){
            return null;
        }
        else{
            linkNode<T> node = this.head;
            while (node != null){
                if(node.data == data){
                    return node;
                }
                else{
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData){
        linkNode<T> searchNode = this.search(isData);
        if(searchNode == null){
            this.addNode(data);
        }
        else{
            linkNode<T> nextNode = searchNode.next;
            searchNode.next = new linkNode<T>(data);
            searchNode.next.next = nextNode;
        }
    }

    public boolean deleteNode(T isData){
        if(this.head == null){
            return false;
        }
        else{
            linkNode<T> node = this.head;
            if(node.data == isData){
                this.head = this.head.next;
                return true;
            }
            else{
                while (node.next != null){
                    if(node.next.data == isData){
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    public void printAll(){
        if(head != null){
            linkNode<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }
}

public class ArrayListMulCam {
    public static void main(String[] args){
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<Integer>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(5);
        System.out.println(myLinkedList.head.next);
//        myLinkedList.printAll();
        myLinkedList.addNodeInside(10, 3);
        myLinkedList.deleteNode(3);
        myLinkedList.printAll();
    }
}

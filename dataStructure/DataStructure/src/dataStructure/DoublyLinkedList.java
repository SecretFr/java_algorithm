package dataStructure;

/*
이중 연결 리스트라고도 함
양방향으로 연결되어 있어서 노드 탐색이 양쪽으로 모두 가능
*/
class doubleNode<T>{
    T data;
    doubleNode<T> prev = null;
    doubleNode<T> next = null;
    public doubleNode(T data){
        this.data = data;
    }
}

class doubleLinkedList<T>{
    public doubleNode<T> head = null;
    public doubleNode<T> tail = null;

    public void addNode(T data){
        if(this.head == null){
            this.head = new doubleNode<T>(data);
            this.tail = this.head;
        }
        else{
            doubleNode<T> node = this.head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new doubleNode<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public T searchFromHead(T isData){
        if(this.head == null){
            return null;
        }
        else {
            doubleNode<T> node = this.head;
            while (node != null) {
                if (node.data == isData) return node.data;
                else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public T searchFromTail(T isData){
        if(this.head == null){
            return null;
        }
        else{
            doubleNode<T> node = this.tail;
            while (node != null){
                if(node.data == isData) return node.data;
                else{
                    node = node.prev;
                }
            }
            return null;
        }
    }
    //임의의 노드 앞에 새로운 노드를 추가하는 메소드
    public boolean insertToFront(T isData, T addData){
        if(this.head == null){
            this.head = new doubleNode<T>(addData);
            this.tail = this.head;
            return true;
        }
        else if(this.head.data == isData){
            doubleNode<T> newHead = new doubleNode<T>(addData);
            newHead.next = this.head;
            this.head = newHead;
            return true;
        }
        else{
            doubleNode<T> node = this.head;
            while (node != null){
                if(node.data == isData){
                    doubleNode<T> nodePrev = node.prev;
                    nodePrev.next = new doubleNode<T>(addData);
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;
                    return true;
                }
                else {
                    node = node.next;
                }
            }
            return false;
        }
    }

    public boolean deleteNode(T isData){
        if(this.head == null) return false;
        else{
            doubleNode<T> node = this.head;
            if(node.data == isData){
                this.head = this.head.next;
                return true;
            }
            else{
                while (node.next != null){
                    if(node.next.data == isData){
                        if(node.next.next == null){
                            this.tail = node;
                            node.next = null;
                            return true;
                        }
                        else {
                            node.next = node.next.next;
                            node.next.prev = node;
                            return true;
                        }
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    public void printAll(){
        if(this.head != null){
            doubleNode<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args){
        doubleLinkedList<Integer> node = new doubleLinkedList<>();
        node.addNode(1);
        node.addNode(2);
        node.addNode(3);
        node.addNode(4);
        node.addNode(5);
        System.out.println("-------------------");

        node.insertToFront(3, 2);
        node.printAll();

        System.out.println("-------------------");

        node.insertToFront(6, 2);
        node.insertToFront(1, 0);
        node.printAll();
        System.out.println("-------------------");

        node.addNode(6);
        node.printAll();

        System.out.println("-------------------");
        node.deleteNode(3);
        node.deleteNode(6);
        node.deleteNode(4);
        node.printAll();
    }
}

package dataStructure;

/*
Tree
트리 Node와 Branch를 이용해서, 사이클을 이루지 않도록 구성한 데이터 구조
이진 트리 형태의 구조로, 탐색(검색) 알고리즘 구현을 위해 많이 사용됨

-node: 트리에서 데이터를 저장하는 기본 요소(데이터와 다른 연결된 노드에 대한 branch 정보 포함)
-root node: 트리 최상위 노드
-level: 최상위 노드를 level 0으로 하였을 때, 하위 branch로 연결된 노드의 깊이를 나타냄
-parent node: 어떤 노드의 다음 레벨에 연결된 노드
-child node: 어떤 노드의 상위 레벨에 연결된 노드
-leaf node(terminal node): child node가 하나도 없는 노드
-sibling(brother node):동일한 parent node를 가진 노드
-depth: 트리에서 node가 가질 수 있는 최대 level
*/
class Node{
    Node left;
    Node right;
    int value;
    public Node(int data){
        this.value = data;
        this.left = null;
        this.right = null;
    }
}

class NodeMgmt{
    Node head = null;

    public boolean insertNode(int data){
        //case1: Node가 하나도 없을 때
        if(this.head == null){
            this.head = new Node(data);
        }
        else{
            //case2: Node가 하나 이상 들어가 있을 때
            Node findNode = this.head;
            while (true){
                //case2-1: 현재 node의 왼쪽에 node가 들어가야할 때
                if(data < findNode.value){
                    if(findNode.left != null){
                        findNode = findNode.left;
                    }
                    else{
                        findNode.left = new Node(data);
                        break;
                    }
                }
                //case2-2: 현재 node의 오른쪽에 node가 들어가야할 때
                else{
                    if(findNode.right != null){
                        findNode = findNode.right;
                    }
                    else{
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node searchNode(int data){
        //case1: Node가 하나도 없을때
        if(this.head == null){
            return null;
        }
        //case2: Node가 하나 이상 있을때
        Node findNode = this.head;
        while (findNode != null){
            if(findNode.value == data){
                return findNode;
            }
            else if(data < findNode.value){
                findNode = findNode.left;
            }
            else{
                findNode = findNode.right;
            }
        }
        return null;
    }

    public boolean deleteNode(int value){
        boolean searched = false;
        Node currParentNode = this.head;
        Node currNode = this.head;

        //exception1: Node가 하나도 없을때
        if(this.head == null) return false;
        //exception2: Node가 단지 하나만 있고, 해당 Node가 삭제할 Node일 때
        else{
            if(this.head.value == value && this.head.left == null && this.head.right == null){
                this.head = null;
                return true;
            }

            while (currNode != null){
                if(currNode.value == value){
                    searched = true;
                    break;
                }
                else if(value < currNode.value){
                    currParentNode = currNode;
                    currNode = currNode.left;
                }
                else{
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }
            if(searched == false) return false;
        }
        //여기까지 실행되면 currNode에는 해당 데이터를 가지고 있는 Node
        //currParentNode는 해당 데이터를 가지고 있는 Node의 부모 Node

        //exception3: 삭제할 노드가 Leaf Node인 경우
        if(currNode.left == null && currNode.right == null) {
            if (value < currParentNode.value) {
                currParentNode.left = null;
                currNode = null;
            } else {
                currParentNode.right = null;
                currNode = null;
            }
            return true;
        }
        //exception4-1: 삭제할 Node가 Child Node(왼쪽)를 가지고 있는 경우
        else if(currNode.left != null && currNode.right == null){
            if(value < currParentNode.value){
                currParentNode.left = currNode.left;
                currNode = null;
            }
            else{
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
        }
        //exception4-2: 삭제할 Node가 Child Node(오른쪽)를 가지고 있는 경우
        else if(currNode.left == null && currNode.right != null){
            if(value < currParentNode.value){
                currParentNode.left = currNode.right;
                currNode = null;
            }
            else{
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
        }
        //exception5-1: 삭제할 노드가 왼쪽, 오른쪽 자식 Node를 가지고 있고
        else{
            //삭제할 Node가 부모 Node의 왼쪽에 있을때
            if(value < currParentNode.value){
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;
                while (changeNode.left != null){
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }
                //changeNode에는 삭제할 Node의 오른쪽 Node중에서 가장 작은 값을 가진 Node가 들어있음

                if(changeNode.right != null){
                    //exception5-1-2: changeNode의 오른쪽 child Node가 있을 때
                    changeParentNode.left = changeNode.right;
                }
                else{
                    //exception5-1-1: changeNode의 child Node가 없을 때
                    changeParentNode.left = null;
                }
                //currParentNode의 왼쪽 child Node에 삭제할 Node의 오른쪽 자식중 가장 작은 값을 가진 changeNode를 연결
                currParentNode.left = changeNode;
                //parentNode의 왼쪽 child Node가 현재, changeNode이고, changeNode의 왼쪽/ 오른쪽 childNode를 모두, 삭제할 currNode의
                //기존 왼쪽/오른쪽 Node로 변경
                changeNode.right = currNode.right;
                changeNode.left = currNode.left;
                currNode = null;
            }
            //삭제할 Node가 부모 Node의 오른쪽에 있을 때
            else{
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;
                while (changeNode.left != null){
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }
                //changeNode에는 삭제할 Node의 오른쪽 Node중에서 가장 작은 값을 가진 Node가 들어있음

                if(changeNode.right != null){
                    //exception5-1-1: changeNode의 child Node가 없을 때
                    changeParentNode.left = changeNode.right;
                }
                else{
                    changeParentNode.left = null;
                }
                //currParentNode의 오른쪽 child Node에 삭제할 Node의 오른쪽 자식중 가장 작은 값을 가진 changeNode를 연결
                currParentNode.right = changeNode;
                //parentNode의 왼쪽 child Node가 현재, changeNode이고, changeNode의 왼쪽/ 오른쪽 childNode를 모두, 삭제할 currNode의
                //기존 왼쪽/오른쪽 Node로 변경
                changeNode.right = currNode.right;
                changeNode.left = currNode.left;
                currNode = null;
            }
            return true;
        }
    }
}

public class Tree {
    public static void main(String[] args){
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(10);
        myTree.insertNode(15);
        myTree.insertNode(13);
        myTree.insertNode(11);
        myTree.insertNode(14);
        myTree.insertNode(18);
        myTree.insertNode(16);
        myTree.insertNode(19);
        myTree.insertNode(17);
        myTree.insertNode(7);
        myTree.insertNode(8);
        myTree.insertNode(6);

        System.out.println(myTree.deleteNode(15));
        System.out.println("HEAD: "+myTree.head.value);
        System.out.println("HEAD LEFT: "+myTree.head.left.value);
        System.out.println("HEAD LEFT LEFT: "+myTree.head.left.left.value);
        System.out.println("HEAD LEFT RIGHT: "+myTree.head.left.right.value);

        System.out.println();

        System.out.println("HEAD RIGHT: "+myTree.head.right.value);
        System.out.println("HEAD RIGHT LEFT: "+myTree.head.right.left.value);
        System.out.println("HEAD RIGHT RIGHT: "+myTree.head.right.right.value);

        System.out.println();

        System.out.println("HEAD RIGHT RIGHT LEFT: "+myTree.head.right.right.left.value);
        System.out.println("HEAD RIGHT RIGHT RIGHT: "+myTree.head.right.right.right.value);
    }
}

package dataStructure;
/*
Hash Collision 해결법
1. Chaining 기법
충돌이 일어나면, 링크드 리스트 자료구조를 이용하여 또다른 저장공간을 생성
*/

public class HashChaining {
    public Slot[] hashTable;

    public HashChaining(Integer size){
        this.hashTable = new Slot[size];    
    }

    public class Slot{
        String key;
        String value;
        Slot next;
        Slot(String key ,String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    //Division 기법: 가장 간단한 해쉬 함수 중 하나로, 나누기를 통해, 나머지 값을 사용하는 기법
    public int hashFunc(String key){
        return Character.getNumericValue(key.charAt(0))%this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];

            while(findSlot != null){
                if(findSlot.key == key){
                    findSlot.value = value;
                    return true;
                }
                else{
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        }
        else{
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            Slot findSlot = this.hashTable[address];
            while(findSlot != null){
                if(findSlot.key == key){
                    return findSlot.value;
                }
                else{
                    findSlot = findSlot.next;
                }
            }
            return null;
        }
        else{
            return null;
        }
    }
    
    public static void main(String[] args){
        HashChaining mainObject = new HashChaining(20);
        mainObject.saveData("DaveLee", "101038293");
        mainObject.saveData("fun-coding", "222101038293");
        mainObject.saveData("fun-deep", "123");
        mainObject.saveData("fun-call", "123");
        System.out.println(mainObject.getData("fun-call"));
    }
}

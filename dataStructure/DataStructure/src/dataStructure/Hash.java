package dataStructure;
//key에 value(data)를 매핑할 수 있는 구조
//key를 통해 데이터가 저장되어 있는 주소를 알 수 있으므로, 저장 및 탐색 속도가 획기적으로 빨라짐
//key -> hash function(key) -> hash table

/*
장점
데이터 저장 및 읽기 속도가 빠르다.
해쉬는 키에 대한 데이터가 있는지(중복) 확인이 쉬움
*/

/*
단점
일반적으로 저장공간이 좀더 많이 필요하다
여러 키에 해당하는 주소가 동일할 경우 충돌을 해결하기 위한 별도 자료구조가 필요하다
-> Hash Collision
*/

/*
주요용도
검색이 많이 필요한 경우
저장, 삭제, 읽기가 빈번한 경우
캐쉬 구현시(중복 확인이 쉽기 때문)
*/

/*
Hash Collision 해결법
1. Chaining 기법
충돌이 일어나면, 링크드 리스트 자료구조를 이용하여 또다른 저장공간을 생성

2. Linear Probing 기법
충돌이 일어나면, 해당 hash address 다음 address부터 맨 처음 나오는 빈공간에 저장하는 기법
저장공간 활용도를 높이기 위한 기법
*/

public class Hash {
    public Slot[] hashTable;

    public Hash(Integer size){
        this.hashTable = new Slot[size];    
    }

    public class Slot{
        String value;
        Slot(String value){
            this.value = value;
        }
    }

    //Division 기법: 가장 간단한 해쉬 함수 중 하나로, 나누기를 통해, 나머지 값을 사용하는 기법
    public int hashFunc(String key){
        return Character.getNumericValue(key.charAt(0))%this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            this.hashTable[address].value = value;
        }
        else{
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            return this.hashTable[address].value;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args){
        Hash mainObject = new Hash(20);
        mainObject.saveData("DaveLee", "101038293");
        mainObject.saveData("fun-coding", "222101038293");
        mainObject.saveData("aun-deep", "123");
        System.out.println(mainObject.getData("fun-coding")); 
    }
}



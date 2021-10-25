package dataStructure;

/*
2. Linear Probing 기법
충돌이 일어나면, 해당 hash address 다음 address부터 맨 처음 나오는 빈공간에 저장하는 기법
저장공간 활용도를 높이기 위한 기법
*/

public class HashLinearProbing {
    public Slot[] hashTable;

    public HashLinearProbing(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String key;
        String value;
        Slot(String key ,String value){
            this.key = key;
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
            if(this.hashTable[address].key == key){
                this.hashTable[address].value = value;
                return true;
            }
            else{
                Integer currAddress = address + 1;
                while (this.hashTable[currAddress] != null){
                    if(this.hashTable[currAddress].key == key){
                        this.hashTable[currAddress].value = value;
                        return true;
                    }
                    else{
                        currAddress++;
                        if(currAddress >= this.hashTable.length){
                            return false;
                        }
                    }
                }
                this.hashTable[currAddress] = new Slot(key, value);
                return true;
            }
        }
        else{
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            if(this.hashTable[address].key == key){
                return this.hashTable[address].value;
            }
            else{
                Integer currAddress = address + 1;
                while (this.hashTable[currAddress] != null){
                    if(this.hashTable[currAddress].key == key){
                        return this.hashTable[currAddress].value;
                    }
                    else{
                        currAddress++;
                        if(currAddress >= this.hashTable.length){
                            return null;
                        }
                    }
                }
                return null;
            }

        }
        else{
            return null;
        }
    }

    public static void main(String[] args){
        HashLinearProbing mainObject = new HashLinearProbing(20);
        mainObject.saveData("DaveLee", "101038293");
        mainObject.saveData("fun-coding", "222101038293");
        mainObject.saveData("fun-deep", "1231111");
        mainObject.saveData("fun-call", "12333333");
        System.out.println(mainObject.getData("fun-coding"));
    }
}

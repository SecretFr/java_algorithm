# Learn Collection & DataStructure with JAVA
## Java Collection Framework
### List Collection
List 컬렉션을 사용하는 목적은 데이터들이 중복 저장이 가능할 때, 배열에 들어간 순서를 유지하고 싶을때, 해당 인터페이스의 기능들입니다.

* boolean add(E 객체): 주어진 객체를 list 컬렉션 맨 끝에 추가, 성공여부 반환
* void add(int index, E객체): 주어진 객체를 list 컬렉션 주어진 인덱스에 추가
* E set(int index, E객체): list 컬렉션 해당 인덱스에 위치한 객체를 들어온 객체로 교체하고, 기존에 있던 객체를 반환합니다.
* boolean contains(E객체): 객체가 list 컬렉션 내부에 존재하는지 찾습니다.
* E get(int index): list 컬렉션에서 주어진 index의 위치한 객체를 반환합니다.
* boolean isEmpty(): list 컬렉션이 비어있는지 반환합니다.
* int size(): list 컬렉션의 사이즈를 리턴합니다.
* void clear(): list 컬렉션에 저장된 모든 객체를 삭제합니다.
* E remove(int index): list 컬렉션에서 해당 index 위치의 객체를 삭제하고 반환합니다.
* boolean remove(int index): list 컬렉션 해당 index 위치의 객체를 삭제하고 성공여부를 반환합니다.

#### ArrayList
* 장점: 검색이 빠르다. 순차적으로 데이터가 추가된다면 빠르다.
* 단점: list들의 중간 중간 데이터에 빈번한 추가 삭제가 일어난다면 느리다. List 컬렉션을 여러 스레드에서 공유해야 한다면 Thread safe 하지 않다.

#### Vector
* ArrayList와 내부 구조는 동일하지만 Thread safe하다.

#### LinkedList
* 장점: 중간에 빈번한 삭제가 삽입이 일어날 때 좋은 성능을 발휘한다.
* 단점: 검색이 느리다.


### Set Collection
Set 컬렉션을 사용하는 목적은 순서가 필요없고, Set에 저장될 데이터가 중복이 되면 안될때 입니다. (단 LinkedHashSet은 순서도 보장합니다.)

* boolean add(E 객체): 주어진 객체를 set 컬렉션에 저장합니다.
* boolean contains(E 객체): 객체가 set 컬렉션 내부에 존재하는지 찾습니다.
* Itorator iterator(): set 컬렉션에 저장된 객체를 가져오는 반복자를 반환합니다.
* boolean isEmpty(): 컬렉션이 비어있는지 반환합니다.
* int size(): 컬렉션의 사이즈를 리턴합니다.
* void clear(): 컬렉션에 저장된 모든 객체를 삭제합니다.
* boolean remove(E 객체): 컬렉션에서 해당 객체를 삭제합니다.

#### HashSet
* 객체를 저장하기 전에 저장할 객체의 hashCode() 메소드를 호출해서 해쉬코드를 알아내고, set 내부의 hashCode와 비교하여 없을 때 저장한다. Thread safe하지 않다.

#### TreeSet
* 기본적으로 오름차순 정렬하여 저장한다. Thread safe 하지 않다.

#### LinkedHashSet
* 입력된 순서대로 저장한다. Thread safe 하지 않다.

### Map Collection
Map 컬렉션을 사용하는 목적은 데이터를 저장할 때, key와 value 쌍으로 저장하고 싶을 때, 그리고, key를 중복 저장하고 싶지 않을 때입니다.

* E put(K객체, E객체): 주어진 K객체를 키로, E객체를 값으로 컬렉션에 추가합니다. 성공 시 E객체를 반환합니다.
* boolean containsKey(E객체): 컬렉션에 해당 객체를 key로하는 객체 존재 여부를 반환합니다.
* boolean containsValue(E객체): 해당 객체를 값으로 하는 객체가 컬렉션에 존재하는지 반환합니다.
* E get(V key): 컬렉션에서 해당 key객체를 찾아 값을 반환합니다.
* boolean isEmpty(): 컬렉션이 비었는지 확인합니다.
* set keySet(): 컬렉션의 모든 key객체를 Set객체에 담아 반환합니다.
* int size(): 컬렉션의 길이를 반환합니다.
* Collection values(): 저장된 모든 값을 Collection에 담아 반환합니다.
* void clear(): 컬렉션의 모든 데이터를 제거합니다.
* E remove(E key): 컬렉션에서 해당 key객체를 가지는 부분을 제거합니다.

#### HashMap
* HashMap의 key로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야 합니다. String 객체의 경우 이런 부분이 잘 정의되어 있어 key값으로 많이 사용합니다. Thread safe하지 않습니다.

#### HashTable
* HashMap과 동일한 내부구조. 단, Thread safe하다.

#### Properties
* HashTable의 하위 클래스입니다. 특징은 key값을 String으로 제한한 클래스. 주 사용목적은 .properties파일을 읽을 때 사용

#### TreeMap
* key값으로 오름차순 정렬되어 저장


# DataStructure(선형구조)
## 리스트(List)
* 배열과의 차이점 : 빈틈없이 자료를 적재하는 것이 목적인 자료구조, 자료 중간의 삭제가 일어난다면 중간의 자료를 제거하고 앞뒤 연결이 필요하다.

### 순차리스트
* 배열을 기반으로 구현된 리스트, index로 바로 데이터를 가지고 올 수 있어 검색이 빠르지만 중간 데이터의 삭제가 일어난다면 삭제 후 다시 정리하는 과정이 필요하다는 것이 단점. 따라서, 중간 데이터의 빈번한 수정이 일어난다면 비추천
```
List<Integer> numberList = new ArrayList<>();
```

### 연결리스트
* 데이터가 서로 연결된 형태의 자료형
* 데이터 추가 및 삭제는 위치정보 수정만드로 가능, 추가 삭제에 유용
* 검색을 위해서는 자료를 순차적으로 확인해야 하기 때문에 검색에는 비효율적

### 단순 연결 리스트(simple linked list)
* 현재의 노드들은 다음 노드를 가리키는 하나의 참조만을 가지고 있기에 한쪽 방향의 노드의 접근만 가능합니다.

### 이중 연결 리스트(double linked list)
* 끝점과 시작점이 연결된 구조, 앞 뒤 노드와 서로 연결

### 원형 연결 리스트(Circular linked list)
* 단순 연결 리스트 자료구조에서 마지막 노드를 첫 노드와 연결한 구조.



package test2;

class Dog{
	private String name;
	private String type;
	
	public Dog() {}
	
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void showDogInfo(Dog dog) {
		System.out.println("name "+dog.name);
		System.out.println("type "+dog.type);
	}
	
}

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog[] dog = new Dog[5];
		Dog dog1 = new Dog("Messi", "Challenger");
		Dog dog2 = new Dog("Son", "Diamond");
		Dog dog3 = new Dog("Pogba", "Platinum");
		Dog dog4 = new Dog("Kane", "Gold");
		Dog dog5 = new Dog("Rooney", "Silver");
		
		dog[0] = dog1;
		dog[1] = dog2;
		dog[2] = dog3;
		dog[3] = dog4;
		dog[4] = dog5;
//		for(int i=0; i<dog.length; i++) {
//			System.out.println("name : "+ dog[i].getName());
//			System.out.println("type : "+ dog[i].getType());
//		}
		
		
		for(Dog val : dog) {
			val.showDogInfo(val);
//			System.out.println("name : "+val.getName()+"\nType : "+val.getType());
		}
		
		
		
	}

}
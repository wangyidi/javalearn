class Animal{
	int legs;
	double height;
	boolean tail;
	public void walk(){
	System.out.println("it can walk");
	}
}
class Mammal extends Animal{
	boolean hair;
	public void show(){
		System.out.println("wo are beautiful");
	}
}
public class Dog extends Mammal {
	int kk;
	public static void fly(){
		System.out.println("I can fly");
	}
	public static void main(String[] args) {
 	Mammal m=new Mammal();
 	m.legs=12;
 	System.out.println(m.hair);
 	m.show();
 	Dog.fly();
 	
 	}

}
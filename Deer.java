interface Vagetarian{
	void notkill();
}
class Animal{
	public void run(){
	System.out.println("Animal---i can run");
	}
	public void run(String str){
	System.out.println("Animal---i can runn");
	}
	// public String toString(){
	// return "asd";
	// }

}
public class Deer extends Animal implements Vagetarian{
	public void run(){
		System.out.println("Deer-----I CAN run" );
	}
	public void notkill(){
		System.out.println("i am notkill");
	}
	public void sleep(){
		System.out.println("shuijiao ");
	}
    public static void main(String[] args) {
    	Deer d =new Deer(); 
    	d.run();
    	Animal a = new Deer();
    	Deer deer= (Deer)a;
    	deer.run("ad");
    	// deer.notkill();
    	// deer.sleep();
    	d.sleep();
    	d.notkill();
    }
}
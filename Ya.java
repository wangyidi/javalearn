class Person{
	int age;
	String name;
	public Person(int a,String b){
		age=a;
		name=b;
		System.out.println(age+name);
	}
	public Person(int a){
		age=a;
		System.out.println(age);
	}
}
public class Ya{
	public static void main(String[] args) {
		Person m1=new Person(18,"zhangyu");
		Person m2=new Person(19);
	}
}

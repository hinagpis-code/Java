class Person{
	
	//method inside Person class
	public void myName() {
		System.out.println("Person Class");
	}
}

public class AnotherClass {

	static Person p = new Person();
	
	//method inside AnotherClass
	public void myName()
	{
		System.out.println("Another Class");
	}
	
	public static void main(String[] args) {
		AnotherClass n = new AnotherClass();
		p.myName();
		n.myName();

	}
}


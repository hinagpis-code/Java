class Person{
	
	public void myName() {
		System.out.println("Person Class");
	}
}

public class AnotherClass {

	static Person p = new Person();
	
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


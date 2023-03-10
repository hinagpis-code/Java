class OuterDemo{
	
	public void outer() {
		System.out.println("Im out");
	}
	
	class InnerDemo{
		public void inner() {
			System.out.println("Im in");
		}
	}
}

//Main Class
public class InnerClass {
	
	public static void main(String[] args) {
		
		OuterDemo o = new OuterDemo();
		OuterDemo.InnerDemo i = o.new InnerDemo();
	
		o.outer();
		i.inner();

	}

}


public class OverloadingMethod {

	//Overloading = same method name but different arguments
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingMethod obj = new OverloadingMethod();
		System.out.println("Sum of 10 and 10 is " + obj.add(10, 10));
		System.out.printf("Sum of 20.5 and 30.13 is %2f",obj.add(20.5, 30.13));
		System.out.println("\nSum of 30, 50 and 16 is " + obj.add(30, 50, 16));
	}

}

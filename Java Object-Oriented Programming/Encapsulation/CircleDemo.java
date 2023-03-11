import java.util.*;

class Circle{
	
	private float radius;
	private float diameter;
	private float circumference;
	
	public float setRadius(float rad) {
		this.radius = rad;
		return rad;
	}
	
	public float getDiameter() {
		this.diameter = radius * 2;
		return diameter;
	}
	
	public float getCircumference() {
		this.circumference = (float)(Math.PI * radius * 2);
		return circumference;
	}
	
	public float getDFromC() {
		this.diameter =(float) (circumference / Math.PI);
		return diameter;
	}
	
}

public class CircleDemo {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.print("Enter radius : ");
		float rad = sc.nextFloat();
		
		c.setRadius(rad);		
		System.out.println("Diameter : " + c.getDiameter());
		System.out.println("Circumference : " +c.getCircumference());
		System.out.println("Diameter from Circum. : " + c.getDFromC());

	}

}

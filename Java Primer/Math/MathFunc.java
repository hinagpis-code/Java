public class MathFunc{
 
  public static void main(String[] args){
    
    int w = 34, x = 10, y = 234, z = 123;
		
		double  k = 100D;
		
		System.out.println(Math.abs(z)); //output : 123
		System.out.println(Math.pow(x, w)); //output : 100
    
	 /*output : 234 because it 
		return the highest value 
	  between 10 and 234*/
    System.out.println(Math.max(x, y));
		
		//return the lowest between 10 and 234
    System.out.println(Math.min(x, y)); //output : 10
					
		
		System.out.println(Math.PI); //it show the value of PI 3.141592653589793
		
		System.out.println(Math.addExact(x, w)); //add output : 12
		System.out.println(Math.round(123.2323D)); //Round off
		System.out.println(Math.round(Math.random() * k)); //Random number
		System.out.println(Math.decrementExact(w - 4));
    
  }
  
}

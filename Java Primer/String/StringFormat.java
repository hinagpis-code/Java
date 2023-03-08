public class StringFormat{
 
  public static void main(String [] args){
    
    int myAge = 20;
    
    String age = String.format("My age is : %d", myAge);
    System.out.println(age);
    
    //another exmaple is the use of printf method
    
    int myNumber = 123;
    System.out.printf("My number is %d", myNumber);
    
   
   float myDecimal = 5.434f;
   //we will print 2 decimal places
   System.out.printf("My floas is %2f", myDecimal);
  }
  
}

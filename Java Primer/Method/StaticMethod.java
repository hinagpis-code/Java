// static keyword allows you to call the method without instantianting.
public class StaticMethod{
 
  public static void myName(){
   System.out.println("Hinagpis Code"); 
  }
  
  public void myName1(){
    
   System.out.println("Hinagpis Code"); 
  }
  
  public static void main(String[]args){
    
    StaticMethod obj = new StaticMethod();
    
    //calling static method
    myName();
    
    //calling non-static method     
    obj.myName1();
    
  }
  
}

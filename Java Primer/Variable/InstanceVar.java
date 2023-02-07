/*A variable declared inside the class but outside the body of the
  method, is called an instance variable. It is not declared as static.

    It is called an instance variable because its value is
    instance-specific and is not shared among instances.
  */

public class InstanceVar{
  
  //instance variable (outside the method but inside the class
  String name = "Hinagpis Code";
  
  
  //Driver's Function
  public static void main(String[] args){
    InstanceVar obj = new InstanceVar();
    
    System.out.print(obj.name); //Output: Hinagpis Code
    
  }
  
  
}

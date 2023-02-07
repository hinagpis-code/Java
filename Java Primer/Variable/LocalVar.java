public class LocalVar{
  /*
  LOCAL VARIABLE
  
  A variable declared inside the body of the method/function is called local variable.
  You can use this variable only within that method and the other methods
  in the class aren't even aware that the variable exists.

  A local variable cannot be defined with "static" keyword.
  */
  
  void print(){
    
   //this is local variable
   String name = "Hinagpis Code";
    
    System.out.print(name);
  }
  
 public static void main(String[] args){
   
   LocalVar obj = new LocalVar();
   
   onj.print(); //output: Hinagpis Code
   
    }
  
}

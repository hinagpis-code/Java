/*A variable that is declared as static is called a static variable. 
It cannot be local. You can create a single copy of the static variable
and share it among all the instances of the class. 
Memory allocation for static variables happens only 
once when the class is loaded in the memory.*/

public class StaticVar{
  
  //static string variable
  public static String name = "Hinagpis Code";
  
  //static int variable
  public static int age = 20;
  
 public static void main(String[] args){
   
   System.out.print("My age is " + age); //Output: My age is 20
   
 }
  
}

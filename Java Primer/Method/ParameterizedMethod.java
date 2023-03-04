/*
Parameter are the "( )" in method or constructor
that consist default or specific value;
*/

public class ParameterizedMethod{
  
  //no return type because its void
  public void myName(String name){  
   System.out.println("My name is "+ name); 
  }
  
  //return integer
  public int myAge(int age){
   System.out.println("I am " + age); 
    return age;
  }
  
  //return character
  public char mySex(char sex){
   System.out.println("My sex is " + sex); 
    return sex;
  }
  
  
 public static void main(String[]args){
   
   //create an object
   ParameterizedMethod obj = new ParameterizedMethod();
   
   //call object + method name and pass a value to arguements.
   obj.myName("Hinagpis Code");
   obj.myAge(20);
   obj.mySex('M');
   
 }
  
}

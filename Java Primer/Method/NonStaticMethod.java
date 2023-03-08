 /*
   Method/Function is a block of code that
   when called, performs specific actions mentioned in it.
  
   REMEMBER:  We cant create a method inside another method.
  
  */
  
public class NonStaticMethod{
  
  //this method has no return type because it has void
  public void showName()
  {
   System.out.println("Hinagpis Code");   
  }
  
  //this method return int value for age
  public int age()
  {
    int age = 20;
   System.out.println("I am " + age + " years old."); 
    return age;
  }
  
  public boolean isAdult()
  {
   boolean adult = true;
   System.out.println("I am adult");
   return adult;
  }
  
 public static void main(String[] args){
  
   //create an object to call the method
   NonStaticMethod obj = new NonStaticMethod();
   
   //use object name and to access the method use . (dot)
   obj.showName();
   obj.age();
   obj.isAdult();
  
 }
  
}

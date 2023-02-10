/*
Import the Scanner utility package
for us to accept the input of the user
*/
import java.util.Scanner;

public class ScannerAge{
  
  //Drivers Program
  public static void main(String [] args){
   
    //Instantiate the Scanner Object
    Scanner input = new Scanner(System.in);
    
    System.out.print("How old are you?: ");
    int age = input.nextInt();
    
    //print the inputted age by calling the variables for scanner
    System.out.println("I am " + age + " years old.");
    
  }
}

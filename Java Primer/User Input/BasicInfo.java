import java.util.Scanner;

public class BasicInfo{
  
  //Drivers Program
  public static void main(String [] args){
   
    //Instantiate the Scanner Object
    Scanner input = new Scanner(System.in);
    
   System.out.print("Enter your Last Name: ");
   String lname = input.nextLine();
   
   System.out.print("Enter your First Name: ");
   String fname = input.nextLine();
   
   System.out.print("Enter your Middle Name: ");
   String mname = input.nextLine();
   
   System.out.print("Enter your address: ");
   String address = input.nextLine();
   
   //print the inputted data
   System.out.println("\nMy name is " + lname + ", " + fname + " " + mname +".");
   System.out.println("I live in " + address);
    
  }
}

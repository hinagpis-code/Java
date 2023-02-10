/*Import the Scanner utility 
package outside the class
*/

import java.util.Scanner;

public class ScannerName{
    
    public static void main(String [] args){
        
      /*Instantiate the scanner object   
      - System.in = accept the input from keyboard
      */
       Scanner input = new Scanner(System.in);
        
       System.out.print("What is your name?:");
      
      //your inputed data will be stored in String name  
      String name = input.nextLine(); 
        
       System.out.println("My name is " + name);
        
    }
}

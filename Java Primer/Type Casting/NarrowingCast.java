/*
Narrow Casting is a manual convertion of larger type
into smaller type.

From double > int
*/

public class NarrowingCast {
  
 public static void main(String [] args){
   
    double num1 = 100D;
   
   //we change the data type of num1
   int average = (int) num1; //manual casting
   
   System.out.print(average);
   
   
 }
}

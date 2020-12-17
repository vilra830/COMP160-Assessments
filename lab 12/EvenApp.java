import java.util.Scanner;

/** This application reads an integer value and prints the sum of all even integers 
  * between 2 and the input value*/


public class EvenApp{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    System.out.println(" Enter an integer greater than 1");
    int input = scan.nextInt(); 
    int start = 2;
    
    if (input >= start){ /*This condition checks whether the number is >= 2 if true, it carries on with the while loop inside it*/
      while (start <= input){
        if (start % 2 == 0) {
          sum += start;
          
        }
        start ++;
      } 
      System.out.println("Sum of even numbers between 2 and " + input + " inclusive is: " + sum);
      
      
      
    } else { /* Printed if the first condition is false*/
      System.out.println("Input value must not be less than 2");
    }
  }
}
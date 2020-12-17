import java.util.Scanner;

/** Hello World exercise.
  * Lab 1 COMP160 Part 1
  * (your name) January 2018 */
public class HelloApp{
  public static void main (String[] args){


    readInt();
  }
  
  
  public static int readInt() { boolean success;
    int input = 0; do {
      success = true;
      System.out.println("Please enter an integer"); try {
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
      } catch (java.util.InputMismatchException e) {
        System.out.println("Unexpected input, please try again.");
        success = false;
      }
    } while (!success);
    return input; }
  
}
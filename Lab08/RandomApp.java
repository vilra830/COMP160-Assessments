import java.util.Scanner;

/**
 * RandomApp.java
 * Lab 8, Part 2, COMP160  2018
 * Displays a random integer between high and low limits
 * High and low values are typed in by the user.
 */
public class RandomApp{
  public static void main(String[]args){ 
    int lo = readInt("Enter lowest value");
    int hi = readInt("Enter highest value");
    RandomRange r = new RandomRange();
    System.out.println("Random integer between " + lo + " and " + hi + " : " + r.randomRange(lo, hi)); 
  }
  /** Returns an integer entered by the user*/
  public static int readInt(String message){
    Scanner sc = new Scanner(System.in);
    System.out.println(message);
    return sc.nextInt();
  }
} 





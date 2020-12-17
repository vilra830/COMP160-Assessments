import java.util.Random;

/**
 * RandomApp.java
 * Lab 8, Part 2, COMP160  2018
 * Displays a random integer between high and low limits
 * High and low values are typed in by the user.
 */
public class Randomness{
  public static void main(String[]args){ 
    Random generator = new Random();
    
    int count = 0;
    int number = generator.nextInt(21);
    
   
    while (number != 7){
      number = generator.nextInt(21);
      count ++;
    }
    System.out.println("Jackpot");
    System.out.println(count + " numbers before Jackpot");
      
  }
}
import java.util.Random;
/**
 * RandomRange.java
 * Lab 8, Part 2, COMP160  2018
 * Contains a single method which returns random integer between high and low parameters.
 */


public class RandomRange{
  
  
  
  
  /** Returns random integer between high and low parameters.*/
  public int randomRange(int low, int high){
    Random generator = new Random();
    return generator.nextInt(high-low+1) + low;
  }
  
}
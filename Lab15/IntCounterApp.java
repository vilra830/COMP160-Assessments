import java.util.Scanner;
import java.util.Random;


/** This application asks a user to enter an integer and matches that integer with the generated array of random numbers 
  * from 0 to 4 . Prints out the position of the number once matched. 
  * Coded by Rhea Villafuerte 04/09/2018 */

public class IntCounterApp{
  public static void main(String[]args){
    for(int i = 1 ; i<=3 ; i++){
    Scanner sc = new Scanner(System.in);
    System.out.println("Which number do you wish to find?");
    int a = sc.nextInt();
    IntCounter array = new IntCounter(makeArray());
    array.showTarget(a);
    
    }
    
     System.out.println("Finished.");
  }
  
  public static int[] makeArray(){
    Random generator = new Random();
    int[] anArray = new int[(generator.nextInt(4) + 6)];
    for(int  i = 0 ; i<anArray.length ; i++){   
         anArray[i] = generator.nextInt(5);
    }
    return anArray;
      
  }
}
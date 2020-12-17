import java.util.Scanner;
/** This application asks user to input 3 fruits and would then ask to guess the fruits while showing the first 2 letters
  * coded by Rhea Villafuerte 05/09/2018
  */

public class StringArray{
  public static void main(String[] args){
    
    
    String[] fruits = new String[3];
    
    for (int i = 0 ; i < fruits.length ; i++){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a fruitname");
      fruits[i] = sc.nextLine();
    }
    
    for(String fruit : fruits){
      System.out.print("Guess what fruit I am " + fruit.substring(0,2) + "      " + fruit.length() + " letters" + "   " );
      Scanner scan = new Scanner(System.in);
      String n = scan.nextLine();
      
      while (n.equalsIgnoreCase(fruit) == false){
        System.out.println("Try again");
        System.out.print("Guess what fruit I am " + fruit.substring(0,2) + "      " + fruit.length() + " letters" + "   " );
        n = scan.nextLine();
        
      } 
      System.out.println("Correct");
      
    }
    
    
    
  }
  
}  
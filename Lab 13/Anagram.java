import java.util.Scanner;

/** This application determines if a given phrase by user 
  * is an anagram to the second input phrase 
  *Owned by: Rhea Villafuerte 20/08/2018*/


public class Anagram{
  public static void main(String[]args){
    /* This will ask the first phrase*/
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter a phrase");
    String s = scan.nextLine();
      String s1 = s.toLowerCase();
    
    
    /** This will ask the second phrase*/
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter a second phrase");
    String second_s = sc.nextLine(); // This lowers all the letters in the phrase
    String second_s1 = second_s.toLowerCase();
    
    /*This statements will print out letters of the phrases in order*/
    System.out.println(anagram(s1) + " are letters of "+ s + " in order");
    System.out.println(anagram(second_s1) + " are letters of " + second_s + " in order");
    
    /*This condition will compare the sorted phrases whether they are anagram or not*/
    if (anagram(s1).equals(anagram(second_s1))){
      System.out.println (s + " is an anagram of " + second_s);
    } else {
      System.out.println (s + " is not an anagram of " + second_s);
      
    }
    
    
  }
  /** This method will return the sorted phrase from the 2 input phrases*/
  
  public static String anagram(String phrase){
    String new_s = ""; //New phrase with nothing in it yet
    
    /* Nested for loop that checks and compare each letter of the phrase to the letters of the alphabet respectively*/
    for (char ch = 'a' ; ch <= 'z' ; ch++) {
      for (int i = 0; i < phrase.length(); i++){
        if (phrase.charAt(i) == ch){
          new_s += ch;
        }
        
      }
      
    }
    return new_s;
    
  }
}
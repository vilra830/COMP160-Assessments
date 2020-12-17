import java.util.Scanner;
/* This application counts the number of vowels and consonants in a sentence*/

public class Sentence{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter a sentence");
    int vowelCount = 0 , consonantCount = 0 , count = 0; 
    
   
      String sentence = scan.nextLine().toLowerCase(); 
      System.out.println(sentence);
      
      
      
      while (count < sentence.length()){ /* This loop cotinues while condition remains true*/
        char ch = sentence.charAt(count) ; 
        if ('a' <= ch && ch <='z') {
      switch (ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          vowelCount ++;
          break;
        default: 
          consonantCount ++;
          break;
      }
        }
      count ++ ;
      
      } 
      
      System.out.println("Vowel Count: " + vowelCount);
      System.out.println("Consonant Count: " + consonantCount);
  }
}
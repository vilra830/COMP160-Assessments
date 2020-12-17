/** This class Song disects a song line**/

public class Song {
  /* Data field declaration */
  private String songLine;

  
  /** A constructor that has one String argument called sLine*/
  public Song(String sLine){
    songLine = sLine;
  }
  
  /* accessor method that returns a string*/
  
  public String toString(){
    return songLine;
  }
  
  /* method that disects a line song into different parts*/
  public void process(){
    
    int first_space = songLine.indexOf(' ');
    int second_space = songLine.indexOf(' ', first_space+1);
    
    
    
    System.out.println("Length of is : " + songLine.length());
    System.out.println("Last character of is : " + songLine.charAt(songLine.length() - 1));
    
       
    
    
    if ( !(songLine.indexOf((' '), songLine.indexOf(' ')+1) == -1)) {
      
      String first_2_words = songLine.substring(0,  second_space);
      String subsequent_Words = songLine.substring(second_space+1);
      char first_letter_Third_Word = subsequent_Words.charAt(0);
      
      System.out.println("First two words of are : " +first_2_words);    
      System.out.println("Subsequent words are : " + subsequent_Words);
      System.out.println("First letter of third word is : " + first_letter_Third_Word);
      
    } else { 
      
      
System.out.println("First two words of " + songLine + " are : " + songLine);   
    }  
      
      System.out.println(songLine.toUpperCase());
    System.out.println(songLine.replace(' ', 'x'));
    System.out.println(songLine.indexOf('b'));
    System.out.println(songLine);
    
      
      
      
      
      
      
    }
    }
  

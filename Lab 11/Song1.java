public class Song1 {
  private String songLine;

  public Song1(String sLine){
    songLine = sLine;
  }
  
  public String toString(){
    return songLine;
  }
  
  public void process(){
    
    String firstWord = songLine.substring(0, songLine.indexOf(' '));
    String secondWord = songLine.substring((songLine.indexOf(' ')+1) , (songLine.indexOf(32 ,(songLine.indexOf(' ')+1 ))));
    String subsequentWords = songLine.substring(
    
    System.out.println("Length of " + songLine + " is : " + songLine.length()));
    System.out.println("Last character of " + songLine + " is : " + songLine.charAt(songLine.length() - 1));
    System.out.println("First two words of " + songLine + " are : " + firstWord + " " + secondWord);
    
  
  
  }
    
}
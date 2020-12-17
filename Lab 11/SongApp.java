/* This application disects a song line into various parts*/

public class SongApp{
  
  
  
  public static void main(String[]args){
    
    Song song1 = new Song("While my guitar gently weeps.");
    Song song2 = new Song("Penny Lane");
    Song song3 = new Song("Let it be");
    
    System.out.println(song1.toString());
    
    song1.process();
    
    System.out.println();
    
    System.out.println(song2.toString());
    
    song2.process();
      
    
    System.out.println();
    
    System.out.println(song3.toString());
    
    song3.process();
    
  }
  
}
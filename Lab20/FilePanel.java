import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/** FilePanel.java
  * Lab 20, COMP160,  2018
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  * Edited by Rhea Villafuerte 15/9/2018
  */
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
  
    
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
    String fileName =  "LongBadData.txt"; 
    
    try{
      Scanner fileScan = new Scanner(new File(fileName));
      
                
      while (fileScan.hasNextLine() && drawObjects.hasNextRectangle() ){
        
        String inputLine = fileScan.nextLine();
        
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){ // checks the file line for the right format
          Scanner file = new Scanner(inputLine);
        
        
        // represents the formal parameters for one rectangle;
          
        int fill = file.nextInt();
        int color = file.nextInt();
        int x = file.nextInt();
        int y = file.nextInt();
        int width = file.nextInt();
        int height = file.nextInt();
        boolean value ; 
        Color shade;

        
        if (fill == 1){
          value = true;
        } else {
          value = false;
        }
        
        if (color == 1){
          shade = Color.red;
          
        } else if (color == 2){
          shade = Color.blue;
          
        } else {
          shade = Color.green;
          
        }
        
        drawObjects[count] = new Rectangle(value,shade, x, y,width,height);
        
        count++;
        
        }
        
      } 
      
    } catch (FileNotFoundException e){
      System.out.println("File not found. Check file name and location.");
      System.exit(1); // Stops the program - cannot proceed without a file.
    }         
    
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}
